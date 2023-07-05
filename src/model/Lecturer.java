package model;

/**
*  Lecturere im Project StudentOrg
*  @autor Joel Bierhals
*/ 

public class Lecturer extends Person implements Employee {
    private int persNo;
    public Lecturer() {
    }

    public Lecturer(String firstName, String lastName) {
       super(firstName, lastName);
    }

    public Lecturer(String firstName, String lastName, int birth) {
        super(firstName, lastName, birth);
    }

    @Override
    public String toString() {
        return super.toString() +  " Lecturer {}";
    }

    @Override
    protected void newInput() {
        System.out.println("New Lecturer");
    }

    @Override
    public void setPersNo(int persNo) {
        this.persNo = persNo;
    }

    @Override
    public int getPersNo() {
        return persNo;
    }

    @Override
    public String getFunction() {
        return "Lecturer";
    }
    
}
