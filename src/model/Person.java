package model;

import java.util.Scanner;

public class Person {
    private String firstName, lastName;
    private int birth;
    private static Scanner sc = new Scanner(System.in);

    public Person() {}

    public Person(String firstname) {
        this.firstName = firstname;
    }

    public Person(String firstname, String lastname) {
        this.firstName = firstname;
        this.lastName = lastname;
    }

    public Person(String firstname, String lastname, int birth) {
        this.firstName = firstname;
        this.lastName = lastname;
        this.birth = birth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirth() {
        return birth;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public void newInputDialogue() {

        System.out.println("Firstname: ");
        String firstname = sc.nextLine();
        setFirstName(firstname);

        System.out.println("Lastname: ");
        String lastname = sc.nextLine();
        setLastName(lastname);

        System.out.println("Birth: ");
        int birth = sc.nextInt();
        setBirth(birth);
    }

    public static void newInputDialogue(Person person) {
        System.out.println("Firstname: ");
        String firstname = sc.nextLine();
        person.setFirstName(firstname);

        System.out.println("Lastname: ");
        String lastname = sc.nextLine();
        person.setLastName(lastname);

        System.out.println("Birth: ");
        int birth = sc.nextInt();
        person.setBirth(birth);
    }

    public String info() {
        String output = "Firstname: " + this.firstName + " Lastname: " + this.lastName + " Birth: " + this.birth;
        return output;
    }

    public static void main(String[] args) throws Exception {

    }

}
