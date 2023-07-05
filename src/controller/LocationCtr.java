package controller;

import model.Location;
import model.Person;
import model.SavingsAccount;
import model.Student;

public class LocationCtr {
    public static void main(String[] args) {
        Location loc1 = new Location("Fürstenallee", 5, 33102, "Paderborn");
        Location loc2 = new Location("Meisenstraße", 92, 33607, "Bielefeld");
        //Location.newInputDialogue(loc1);System.out.println(loc1.toString());
        //loc2.newInputDialogue();System.out.println(loc2.toString());
        Person student1 = new Student("Justin", "Bieber", 1994, 1, "WI", loc1);
        Person student2 = new Student("Phil", "Collins", 1951, 2, "Math", new Location("Rathenaustraße", 3, 33102, "Paderborn"));

        SavingsAccount account1 = new SavingsAccount(student1, 9, 1000 );
        student1.setAccount(account1);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student1.getResidence().getStreet());
    }
}
