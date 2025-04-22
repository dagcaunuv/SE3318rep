package org.example;

public class Mage extends Hero implements Questable {

    public Mage(String name, int level) {
        super(name, level);
    }

    // Mage'e özgü büyü yapma metodu
    public void castSpell() {
        System.out.println(name + " güçlü bir ateş topu oluşturuyor!");
    }

    // Questable arayüzündeki metodu implement et
    @Override
    public void acceptQuest(String questName) {
        System.out.println(name + " büyücü, '" + questName + "' görevini kabul etti.");
    }

    @Override
    public void speak() {
        System.out.println("Ben " + name + ", seviye " + level + " bilgili bir büyücüyüm!");
    }
}