package model;

// Lecturere im Project StudentOrg
//  @autor Joel Bierhals

public class Lecturer extends Person {

    public Lecturer() {
    }

    public Lecturer(String firstName, String lastName) {
       super(firstName, lastName);
    }

    public Lecturer(String firstName, String lastName, int birth) {
        super(firstName, lastName, birth);
    }
    
}