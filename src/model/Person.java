package model;

import java.util.Scanner;

public class Person {
    private String firstName, lastName;
    private String city;
    private int birth;
    protected static Scanner sc = new Scanner(System.in);

    public Person() {}

    public Person(String firstname) {
        this.firstName = firstname;
    }

    public Person(String firstname, String lastname) {
        this.firstName = firstname;
        this.lastName = lastname;
    }

    public Person(String firstname, String lastname, int birth) {
        this(firstname, lastname);
        this.birth = birth;
    }

    public Person(String firstName, String lastName, int birth, String city) {
        this(firstName, lastName, birth);
        this.city = city;
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

    public String getName() {
        return firstName + " " + lastName;
    }

    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getBirth() {
        return birth;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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

        System.out.println("City: ");
        String city = sc.nextLine();
        setCity(city);

        sc.nextLine();
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

        System.out.println("City: ");
        person.setCity(sc.nextLine());

        sc.nextLine();
    }

    public String info() {
        String output = "Firstname: " + this.firstName + " Lastname: " + this.lastName + " Birth: " + this.birth + " City: " + this.city;
        return output;
    }

    public static void main(String[] args) throws Exception {

    }

}
