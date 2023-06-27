package model;

public class SavingsAccount extends Account {
    private double interest;
    private double transactionLimit;
    private static long nextAccountNo = 2000000000;
    private static final long MAX_NO = 3000000000L;

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public double getTransactionLimit() {
        return transactionLimit;
    }

    public void setTransactionLimit(double transactionLimit) {
        this.transactionLimit = transactionLimit;
    }

    public long getNextAccountNo() {
        nextAccountNo++;
        if (nextAccountNo <= MAX_NO)
            return nextAccountNo;
        System.out.println("Die Kontonummer liegt nicht im definierten Bereich");
        return 1;
    }

    public SavingsAccount() {
        long nextAccountNo = getNextAccountNo();
        super.setAccountNo(nextAccountNo);
        if (nextAccountNo != 2)
            super.setiBan(Account.generateIBan(nextAccountNo));
    }

    public SavingsAccount(String owner) {
        this();
        super.setOwner(owner);
    }

    public SavingsAccount(int kontoNummer) {
        this();
        super.setAccountNo(kontoNummer);
    }

    @Override
    public String toString() {
        return super.toString() + " SavingsAccount {\n\tinterest: " + interest + ", \n\ttransactionLimit: "
                + transactionLimit + "\n}";
    }

    @Override
    public void bookNeg(double amount) {
        if (super.getSaldo() - amount >= 0)
            super.bookNeg(amount);
        else
            System.out.println("Transaktion überschreitet verfügbares Geld");
    }

    @Override
    public void bookNeg() {
        System.out.println("Wie viel möchtest du abheben?");
        double amount = sc.nextDouble();
        bookNeg(amount);
    }

    public static void main(String[] args) {

    }
}
