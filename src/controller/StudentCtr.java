package controller;

import model.Person;
import model.Student;

/**
 * Demo-Programm für Student
 * 
 * @author Iris Hanheide
 */

public class StudentCtr {

    public static void main(String[] args) throws Exception {
        Student student1 = new Student("Nathan", "Evans");
        Student student2 = new Student("Miksu", "Macloud", 9999);

        System.out.println(student1.getName() + "\t" + student1.getId());
        System.out.println(student2.info());

        // Konstruktor
        Student student3 = new Student();
        student3.newInputDialogue();
        System.out.println(student3.info());

        Student student4 = new Student();
        Person.newInputDialogue(student4);
        System.out.println(student4.info());

        System.out.println("Es wurden " + Student.getAnzahl() + " Studenten angelegt.");
    }

}
