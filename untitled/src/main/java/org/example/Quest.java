package org.example;
import java.util.List;
import java.util.ArrayList;

public class Quest {
    private String name;
    private String difficulty;
    private List<Adventurer> adventurers;

    public Quest(String name, String difficulty) {
        this.name = name;
        this.difficulty = difficulty;
        this.adventurers = new ArrayList<>();
    }

    public void addAdventurer(Adventurer adventurer) {
        adventurers.add(adventurer);
    }

    public void displayAdventurers() {
        System.out.println("Adventurers in " + name + ": ");
        for (Adventurer adventurer : adventurers) {
            System.out.println(adventurer.getName());
        }
    }
}
