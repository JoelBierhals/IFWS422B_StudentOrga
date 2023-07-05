package model;

public class SavingsAccount extends Account {
    private double interest;
    private double transactionLimit;
    private static long nextAccountNo = 2_000_000_000L;
    private static final long MAX_NO = 3_000_000_000L;

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

    @Override
    public long fetchNextNo() {
        return nextAccountNo;
    }

    @Override
    public void incNextNo() {
        nextAccountNo++;
    }

    @Override
    public long fetchLAST_NO() {
        return MAX_NO;
    }

    public SavingsAccount() {
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

    public SavingsAccount(String owner, double interest, double transactionLimit) {
        this(owner);
        setInterest(interest);
        setTransactionLimit(transactionLimit);
    }

    @Override
    protected String additionalToString() {
        return "\n\tinterest: " + interest + ", \n\ttransactionLimit: "+ transactionLimit;
    }

    @Override
    public void bookNeg(double amount) {
        if (super.getSaldo() - amount >= 0 && super.getSaldo() - amount > 0)
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
