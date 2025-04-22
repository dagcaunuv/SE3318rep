package org.example;

public class Warrior extends Hero implements Questable {

    public Warrior(String name, int level) {
        super(name, level);
    }

    // Warrior'a özgü saldırı metodu
    public void attack() {
        System.out.println(name + " keskin kılıcıyla saldırıyor!");
    }

    // Questable arayüzündeki metodu implement et
    @Override
    public void acceptQuest(String questName) {
        System.out.println(name + " savaşçı, '" + questName + "' görevini kabul etti.");
    }

    @Override
    public void speak() {
        System.out.println("Ben " + name + ", seviye " + level + " korkusuz bir savaşçıyım!");
    }
}