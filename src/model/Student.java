package model;

/**
 * Programmaufbau
 * 
 * @author Iris Hanheide
 */
public class Student extends Person {
    private int id;
    private String subject;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    // Standardkonstruktor
    public Student() {
        if (nextId > LAST_ID) {
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
        nextId = id + 1;
        anzahl++;
    }

    public Student(String firstName, String lastName, int birth, int id, String subject) {
        this(firstName, lastName, birth, id);
        this.subject = subject;
    }

    public Student(String firstName, String lastName, int birth, int id, String subject, Location residence) {
        this(firstName, lastName, birth, id, subject);
        super.setResidence(residence);
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

    @Override
    public void newInput() {
        System.out.println("New Student");
        System.out.println("Subject: ");
        subject = sc.nextLine();
        setSubject(subject);
    }

    public static void newInputDialogue(Student student) {
        Person.newInputDialogue(student);

        System.out.println("Subject: ");
        student.subject = sc.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + " Student {\n\tid: " + id + ", \n\tsubject: " + subject + "\n}";
    }

    public static void main(String[] args) throws Exception {

    }

}
