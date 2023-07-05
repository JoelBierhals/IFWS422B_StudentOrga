package model;

public class Location {
    private String street;
    private int no;
    private int zip;
    private String city;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Location() {

    }

    public Location(String street) {
        this.street = street;
    }

    public Location(String street, int no) {
        this(street);
        this.no = no;
    }

    public Location(String street, int no, int zip) {
        this(street, no);
        this.zip = zip;
    }

    public Location(String street, int no, int zip, String city) {
        this(street, no, zip);
        this.city = city;
    }

    @Override
    public String toString() {
        return "Location {\n\tstreet: " + street + ",\n\tno: " + no + ", \n\tzip: " + zip + ", \n\tcity: " + city
                + "\n}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Location other = (Location) obj;
        if (street == null) {
            if (other.street != null)
                return false;
        } else if (!street.equals(other.street))
            return false;
        if (no != other.no)
            return false;
        if (zip != other.zip)
            return false;
        if (city == null) {
            if (other.city != null)
                return false;
        } else if (!city.equals(other.city))
            return false;
        return true;
    }

    public void newInputDialogue() {
        System.out.println("Street: ");
        street = System.console().readLine();
        System.out.println("No: ");
        no = Integer.parseInt(System.console().readLine());
        System.out.println("Zip: ");
        zip = Integer.parseInt(System.console().readLine());
        System.out.println("City: ");
        city = System.console().readLine();

    }

    public static void main(String[] args) {

    }
}
