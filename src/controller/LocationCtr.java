package controller;

import model.Location;

public class LocationCtr {
    public static void main(String[] args) {
        Location l1 = new Location("Conradstr.", 63, 13509, "Berlin");
        System.out.println(l1);

        Location l2 = new Location();
        l2.newInputDialogue();

        Location l3 = new Location("1", 2, 3, "4");

        System.out.println(l2.equals(l3));

        System.out.println(l2.toString());
    }
}
