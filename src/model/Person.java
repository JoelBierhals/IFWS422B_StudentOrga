package model;

import java.util.Scanner;

public class Person {
    private String firstName, lastName;
    private String city;
    private int birth;
    protected static Scanner sc = new Scanner(System.in);

    public Person() {}

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
        firstName = sc.nextLine();

        System.out.println("Lastname: ");
        lastName = sc.nextLine();

        System.out.println("Birth: ");
        birth = sc.nextInt();

        System.out.println("City: ");
        city = sc.nextLine();

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

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (firstName == null) {
            if (other.firstName != null)
                return false;
        } else if (!firstName.equals(other.firstName))
            return false;
        if (lastName == null) {
            if (other.lastName != null)
                return false;
        } else if (!lastName.equals(other.lastName))
            return false;
        if (city == null) {
            if (other.city != null)
                return false;
        } else if (!city.equals(other.city))
            return false;
        if (birth != other.birth)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Person {\n\tfirstName: " + firstName + ",\n\t lastName: " + lastName + ",\n\t city: " + city + ",\n\t birth: " + birth
                + "\n}";
    }

    public static void main(String[] args) throws Exception {

    }

}
