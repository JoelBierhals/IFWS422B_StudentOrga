package controller;

import model.Person;

public class PersonCtr {
    public static void main(String[] args) throws Exception {
        Person person1 = new Person("Pippi", "Langstrumpf", 1950);
        System.out.println(person1.info());
        person1.newInputDialogue();
        System.out.println(person1.info());

        Person person2 = new Person("Prysselius", "Liese", 1935);
        System.out.println(person2.info());
        person2.newInputDialogue();
        System.out.println(person2.info());
    }
}