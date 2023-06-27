package model;

import java.util.Scanner;

public class Account {
    private long accountNo;
    private String iBan;
    private String owner;
    private double saldo;
    protected Scanner sc = new Scanner(System.in);

    private static final int BLZ = 30050110;
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

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Account() {

    }

    public Account(String owner) {
        this.owner = owner;
    }

    public Account(String owner, double saldo) {
        this.owner = owner;
        this.saldo = saldo;
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
        if (Double.doubleToLongBits(saldo) != Double.doubleToLongBits(other.saldo))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Account {\n\taccountNo: " + accountNo + ", \n\tiBan: " + iBan + ", \n\towner: " + owner
                + ", \n\tsaldo: " + saldo + "\n\t}";
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

    public static String generateIBan(long kontoNummer) {
        int pruefZiffer = 13 - Math.ceilMod(kontoNummer, 13);
        String pruefZifferString = Integer.toString(pruefZiffer);
        if (pruefZiffer < 10)
            pruefZifferString = "0" + pruefZifferString;

        return country + pruefZifferString + BLZ + kontoNummer;
    }

    public static String convertCountryToDigit(String country) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String[] array = country.split("");
        System.out.println("D: " + (alphabet.indexOf(array[0]) + 10));
        return Integer.toString(alphabet.indexOf(array[0]) + 10) + (alphabet.indexOf(array[1]) + 10);
    }

    // public static boolean checkIban(String Iban) {
    // String str = Iban.substring(3, 12) + Iban.substring(12, 20);
    // str += convertCountryToDigit(Iban.substring(0, 2));
    // System.out.println(Long.parseLong(str));

    // System.out.println(str + "long:" + Long.parseLong(str));
    // long prüfsumme = Math.ceilMod(Long.parseLong(str + "00"), 97L);
    // System.out.println(str + "00");

    // return Math.ceilMod(Integer.parseInt(str + prüfsumme), 97) == 1;
    // }

    public static void main(String[] args) {

    }

}
