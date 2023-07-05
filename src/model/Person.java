package model;

import java.util.Scanner;

public abstract class Person {
    private String firstName, lastName;
    private int birth;
    private Location residence;
    private Account account;
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

    public Person(String firstName, String lastName, int birth, Location residence) {
        this(firstName, lastName, birth);
        this.residence = residence;
    }

    public Person(String firstName, String lastName, int birth, Location residence, Account account) {
        this(firstName, lastName, birth, residence);
        this.account = account;
    }

    protected abstract void newInput();

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
        return residence.getCity();
    }

    public Location getResidence() {
        return residence;
    }

    public void setResidence(Location residence) {
        this.residence = residence;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void newInputDialogue() {

        System.out.println("Firstname: ");
        firstName = sc.nextLine();

        System.out.println("Lastname: ");
        lastName = sc.nextLine();

        System.out.println("Birth: ");
        birth = sc.nextInt();

        if(residence == null) residence = new Location();
        System.out.println("City: ");
        residence.setCity(sc.nextLine());

        newInput();
        
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

        if(person.residence == null) person.residence = new Location();

        System.out.println("City: ");
        person.getResidence().setCity(sc.nextLine());

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
        if (residence == null) {
            if (other.residence != null)
                return false;
        } else if (!residence.equals(other.residence))
            return false;
        if (birth != other.birth)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Person {\n\tfirstName: " + firstName + ",\n\t lastName: " + lastName + ",\n\t residence: " + residence + ",\n\t birth: " + birth + ",\n\taccount: " + account
                + "\n}";
    }

    public static void main(String[] args) throws Exception {

    }

}
