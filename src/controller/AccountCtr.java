package controller;

import model.Account;
import model.CheckingAccount;
import model.Person;
import model.SavingsAccount;
import model.Student;

/**
 * AccountCtr: verwendet Account
 * 
 * @author Iris Hanheide
 */

public class AccountCtr {
    public static void main(String[] args) throws Exception {
        System.out.println("\nHello, Account!\n");

        // Press CTRL + ALT
        Person person1 = new Student("Justin", "Biber");
        SavingsAccount sb1 = new SavingsAccount(person1);
        sb1.setTransactionLimit(1000);
        System.out.println(sb1);
        // System.out.println("Check Iban: " + Account.checkIban(sb1.getIban()) + "\n");

        SavingsAccount sb2 = new SavingsAccount(new Student("Ice", "Cream"));
        System.out.println(sb2);
        // System.out.println("Check Iban: " + Account.checkIban(sb2.getIban()) + "\n");

        SavingsAccount sb3 = new SavingsAccount(new Student("Ice", "Cream"));
        System.out.println(sb3);
        System.out.println(Account.checkIban(sb3.getiBan()));

        System.out.println("Vergleich sb3 und sb2: " + sb3.equals(sb2));

        sb3.setAccountNo(1122334400L);
        System.out.println(sb3.toString());
        // System.out.println("Check Iban : " + sb3.getIban() + ": " +
        // Account.checkIban(sb3.getIban()) + "\n");

        CheckingAccount g1 = new CheckingAccount(new Student("Iris", "Hanheide"));
        System.out.println(g1.toString());
        // System.out.println("Check Iban: " + Account.checkIban(g1.getIban()) + "\n");

        CheckingAccount g2 = new CheckingAccount(new Student("Udo", "Lindenberg"));
        System.out.println(g2.toString());
        // System.out.println("Check Iban: " + Account.checkIban(g2.getIban()) + "\n");

        System.out.println("Buchungen für " + sb1.getOwner() + " " + sb1.getClass());
        System.out.println("Saldo: " + sb1.getSaldo());
        sb1.bookNeg();
        sb1.bookPos();
        System.out.println("Saldo: " + sb1.getSaldo());
        double in = 100;
        double out = 100;
        System.out.println("Zubuchung von " + in);
        sb1.bookPos(in);
        System.out.println("Abbuchung von " + out);
        sb1.bookNeg(out);
        System.out.println("Saldo: " + sb1.getSaldo() + "\n");

        System.out.println("Buchungen für " + g2.getOwner() + " " + g2.getClass());
        System.out.println("Saldo: " + g2.getSaldo());
        g2.bookPos();
        g2.bookNeg();
        System.out.println("Saldo: " + g2.getSaldo());
        in = 1000;
        out = 35000;
        System.out.println("Zubuchung von " + in);
        g2.bookPos(in);
        System.out.println("Abbuchung von " + out);
        g2.bookNeg(out);
        System.out.println("Saldo: " + g2.getSaldo());
    }
}
