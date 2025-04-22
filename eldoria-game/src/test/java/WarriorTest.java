package org.example;

import org.junit.jupiter.api.Test;

class WarriorTest {

    @Test
    void testWarriorAttackAndSpeak() {
        Warrior warrior = new Warrior("Leonidas", 20);
        warrior.attack(); // Konsol çıktısı
        warrior.speak();
    }

    @Test
    void testWarriorAcceptQuest() {
        Warrior warrior = new Warrior("Achilles", 18);
        warrior.acceptQuest("Defend the kingdom");
    }
}
