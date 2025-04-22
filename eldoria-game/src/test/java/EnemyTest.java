package org.example;

import org.junit.jupiter.api.Test;

class EnemyTest {

    @Test
    void testEnemySpeak() {
        Enemy enemy = new Enemy("Orc", 5);
        enemy.speak();
    }
}

