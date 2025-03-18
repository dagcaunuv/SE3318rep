package org.example;
import java.util.List;
import java.util.ArrayList;

public class Adventurer extends Character {
    private String race;
    private List<Quest> quests;

    public Adventurer(String name, String title, String race) {
        super(name, title);
        this.race = race;
        this.quests = new ArrayList<>();
    }

    public String getRace() {
        return race;
    }

    public void joinQuest(Quest quest) {
        quests.add(quest);
    }

    @Override
    public void displayDetails() {
        System.out.println("Adventurer Name: " + getName());
        System.out.println("Race: " + race);
        System.out.println("Quests: " + quests.size());
    }
}
