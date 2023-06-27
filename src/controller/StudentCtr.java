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
        System.out.println(student2);

        // Konstruktor
        Student student3 = new Student();
        student3.newInputDialogue();
        System.out.println(student3);

        Student student4 = new Student();
        Person.newInputDialogue(student4);
        System.out.println(student4);

        Person student5 = new Student("Luciano", "Schmidt", 1990);
        Person person5 = new Person("Luciano", "Schmidt", 1990);
        System.out.println(((Student)student5).getId());

        System.out.println(student5.equals(person5));
        System.out.println(person5.equals(student5));

        System.out.println("Es wurden " + Student.getAnzahl() + " Studenten angelegt.");
    }

}
