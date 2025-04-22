package org.example;

public class Main {
    public static void main(String[] args) {
        Adventurer frodo = new Adventurer("Frodo Baggins", "Ring-bearer", "Hobbit");
        Adventurer aragorn = new Adventurer("Aragorn", "King", "Man");

        Mentor gandalf = new Mentor("Gandalf", "Grey Wizard");

        Quest destroyRing = new Quest("Destroy the One Ring", "High");
        destroyRing.addAdventurer(frodo);
        destroyRing.addAdventurer(aragorn);

        gandalf.superviseQuest(destroyRing);

        frodo.displayDetails();
        aragorn.displayDetails();
        gandalf.displayDetails();

        destroyRing.displayAdventurers();
    }
}
