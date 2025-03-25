package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Hogwarts öğrencilerini oluşturuyoruz
        HogwartsStudent harry = new HogwartsStudent("Harry Potter", "Gryffindor", 5);
        HogwartsStudent draco = new HogwartsStudent("Draco Malfoy", "Slytherin", 5);

        // Öğrencilerin öğrendiği büyüler
        harry.learnSpell("Expelliarmus");
        draco.learnSpell("Sectumsempra");

        // Büyü kitabı oluşturuluyor
        Spellbook spellbook = new Spellbook();
        spellbook.addSpell("Expelliarmus");
        spellbook.addSpell("Sectumsempra");
        spellbook.addSpell("Expecto Patronum");

        // Sınıfa öğrencileri ekliyoruz
        MagicClassroom classroom = new MagicClassroom();
        classroom.addStudent(harry);
        classroom.addStudent(draco); // Fazladan "A" kaldırıldı

        // Büyü sınavı oluşturuluyor
        WizardExam exam = new WizardExam(Arrays.asList("Expelliarmus"));
        System.out.println("Did Harry pass? " + exam.pass(harry));
        System.out.println("Did Draco pass? " + exam.pass(draco));

        // İkili büyü düellosu
        Duel.start(harry, draco, "Expelliarmus");
        Duel.start(harry, draco, "Sectumsempra");
    }
}
