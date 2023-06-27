package controller;

import model.Lecturer;
import model.Person;

public class LecturerCtr {
    public static void main(String[] args) throws Exception {

        Lecturer lect1 = new Lecturer("Iris", "Handheide");
        System.out.println(lect1);

        Lecturer lect3 = new Lecturer();
        lect3.newInputDialogue();

        System.out.println(lect3);

        Person.newInputDialogue(lect3);
        System.out.println(lect3);
    }
}
