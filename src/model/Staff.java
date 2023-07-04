package model;

public class Staff extends Person {
    private String function;

    public Staff(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Staff(String firstName, String lastName, String function) {
        this(firstName, lastName);
        this.function = function;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    protected void newInput() {
        System.out.println("New Staff");
        System.out.println("Funktion: ");
        function = sc.nextLine();
    }

    private static void newInputDialog(Staff staff) {
        Person.newInputDialogue(staff);
        staff.setFunction(sc.nextLine());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Staff other = (Staff) obj;
        if (function == null) {
            if (other.function != null)
                return false;
        } else if (!function.equals(other.function))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + "\nStaff {function: " + function + "}";
    }

    public static void main(String[] args) {

    }

}
