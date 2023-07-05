package model;

public class CheckingAccount extends Account {
    private double dispo;
    private static long nextAccountNo = 1_000_000_000L;
    // private static final long MIN_NO = 1000000000;
    private static final long MAX_NO = 2_000_000_000L;

    public static void main(String[] args) {

    }

    public double getDispo() {
        return dispo;
    }

    public void setDispo(double dispo) {
        this.dispo = dispo;
    }

    public long fetchNextNo() {
        return nextAccountNo;
    }

    public CheckingAccount() {
        if (nextAccountNo != 1)
            super.setiBan(Account.generateIBan(nextAccountNo));
    }

    public CheckingAccount(String owner) {
        this();
        super.setOwner(owner);
    }

    @Override
    public String additionalToString() {
        return "\n\tdispo: " + dispo;
    }

    public CheckingAccount(int kontoNummer) {
        super();
        super.setAccountNo(kontoNummer);
    }

    @Override
    public void bookNeg(double amount) {
        if (super.getSaldo() - amount > dispo)
            super.bookNeg(amount);
        else
            System.out.println("Transaktion überschreitet Dispo");
    }

    @Override
    public void bookNeg() {
        System.out.println("Wie viel möchtest du abheben?");
        double amount = sc.nextDouble();
        bookNeg(amount);
    }

    @Override
    public void incNextNo() {
        nextAccountNo++;
    }

    @Override
    public long fetchLAST_NO() {
        return MAX_NO;
    }

}
