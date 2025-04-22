package org.example;
import java.util.List;
import java.util.ArrayList;

public class Mentor extends Character {
    private List<Quest> supervisedQuests;

    public Mentor(String name, String title) {
        super(name, title);
        this.supervisedQuests = new ArrayList<>();
    }

    public void superviseQuest(Quest quest) {
        supervisedQuests.add(quest);
    }

    @Override
    public void displayDetails() {
        System.out.println("Mentor Name: " + getName());
        System.out.println("Supervised Quests: " + supervisedQuests.size());
    }
}
