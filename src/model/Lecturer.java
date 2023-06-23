package model;

public class Lecturer extends Person {
    private String firstName;
    private String lastName;
    private int birth;

    public Lecturer() {

    }

    public Lecturer(String firstName, String lastName) {
        // this();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Lecturer(String firstName, String lastName, int birth) {
        this(firstName, lastName);
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

    public static void main(String[] args) throws Exception {

    }
    
}
