package model;

/**
 * Programmaufbau
 * 
 * @author Iris Hanheide
 */
public class Student extends Person {
    private int id;
    private static int anzahl = 0;
    private static final int FIRST_ID = 1001;
    private static final int LAST_ID = 9999;
    private static int nextId = FIRST_ID;

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Student.nextId = nextId;
    }

    // Standardkonstruktor
    public Student() {
        if(nextId > LAST_ID) {
            id = 0;
            System.out.println("Alle verfügbaren Ids wurden verwendet.");
        } else {
            id = nextId;
            nextId++;
        }

        anzahl++;
    }

    // Konstruktor
    public Student(String firstName, String lastName) {
        this();
        super.setName(firstName, lastName);
    }

    public Student(String firstName, String lastName, int birth) {
        this(firstName, lastName);
        super.setBirth(birth);
    }

    public Student(String firstName, String lastName, int birth, int id) {
        this(firstName, lastName, birth);
        this.id = id;
        nextId = id+1;
        anzahl++;
    }

     public static int getAnzahl() {
        return anzahl;
    }

    public static void setAnzahl(int anzahl) {
        Student.anzahl = anzahl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String info() {
        return super.info() + " Id: " + id;
    }

    public static void main(String[] args) throws Exception {
        Student student1 = new Student();
        student1.setName("Nathan","Evans");
        student1.id=1001;

        Student student2 = new Student();
        student2.setName("Miksu",  "Macloud");
        student2.id = 1002;

        System.out.println("Name: " + student1.getName() + " Id: " + student1.id);
        System.out.println(student2.info());
    }

   
}
