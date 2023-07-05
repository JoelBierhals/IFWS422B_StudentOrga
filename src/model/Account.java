package model;

import java.math.BigInteger;
import java.util.Scanner;

public abstract class Account implements Numberable {
    private long accountNo;
    private String iBan;
    private Person owner;
    private double saldo;
    protected Scanner sc = new Scanner(System.in);

    public static final int BLZ = 30050110;
    public static final String country = "DE";

    public long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }

    public String getiBan() {
        return iBan;
    }

    public void setiBan(String iBan) {
        this.iBan = iBan;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Account() {
        makeNewAccountNo();
    }

    public Account(Person owner) {
        this.owner = owner;
    }

    public Account(Person owner, double saldo) {
        this.owner = owner;
        this.saldo = saldo;
    }

    protected abstract String additionalToString();

    protected void makeNewAccountNo() {
        long nextAccountNo = fetchNextNo();
        long MAX_NO = fetchLAST_NO();
        incNextNo();
        if (nextAccountNo+1 <= MAX_NO)
            this.accountNo = nextAccountNo+1;
        else {
            System.out.println("Die Kontonummer liegt nicht im definierten Bereich");
            this.accountNo = MAX_NO / 1000000000;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Account other = (Account) obj;
        if (accountNo != other.accountNo)
            return false;
        if (iBan != other.iBan)
            return false;
        if (owner == null) {
            if (other.owner != null)
                return false;
        } else if (!owner.equals(other.owner))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Account {\n\taccountNo: " + accountNo + ", \n\tiBan: " + iBan + ", \n\towner: " + owner.getFirstName() + ", " + owner.getLastName()
                + ", \n\tsaldo: " + saldo + additionalToString() + "\n\t}\nCorrect Iban? " + checkIban(iBan);
    }

    public void bookPos(double amount) {
        this.saldo += amount;
    }

    public void bookPos() {
        System.out.print("Wie viel möchtest du einzahlen?");
        double amount = sc.nextDouble();
        bookPos(amount);
    }

    public void bookNeg(double amount) {
        this.saldo -= amount;
    }

    public void bookNeg() {
        System.out.println("Wie viel möchtest du abheben?");
        double amount = sc.nextDouble();
        bookNeg(amount);
    }

    private static int calcCheckDigit(long accountNo) {
        int checkDigit = (int) (accountNo % 13);
        return 13 - checkDigit;
    }

    public static String generateIBan(long kontoNummer) {
        int pruefZiffer = calcCheckDigit(kontoNummer);
        return String.format("%s%02d%s%d", country, pruefZiffer, BLZ, kontoNummer);
    }

    public static String convertCountryToDigit(String country) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String[] array = country.split("");
        System.out.println("D: " + (alphabet.indexOf(array[0]) + 10));
        return Integer.toString(alphabet.indexOf(array[0]) + 10) + (alphabet.indexOf(array[1]) + 10);
    }

    public static boolean checkIban(String Iban) {
        BigInteger bigInt = new BigInteger(
                Iban.substring(4, 12) + Iban.substring(12, 22) + convertCountryToDigit(Iban.substring(0, 2)));
        BigInteger toProof = new BigInteger(bigInt + "00");
        BigInteger modFactor = new BigInteger("97");
        BigInteger forSubtraction = new BigInteger("98");
        BigInteger prüfsumme = toProof.mod(modFactor);
        BigInteger newBigInt = new BigInteger(bigInt.toString() + forSubtraction.subtract(prüfsumme));

        BigInteger one = new BigInteger("1");
        return newBigInt.mod(modFactor).compareTo(one) == 0;
    }

    public static void main(String[] args) {

    }

}
