package org.example;

import org.junit.jupiter.api.Test;

class BattleManagerTest {

    @Test
    void testHeroWinsBattle() {
        Hero hero = new Hero("Heroic", 10);
        Enemy enemy = new Enemy("Goblin", 5);
        BattleManager.battle(hero, enemy);
    }

    @Test
    void testEnemyWinsBattle() {
        Hero hero = new Hero("Weakling", 3);
        Enemy enemy = new Enemy("Troll", 6);
        BattleManager.battle(hero, enemy);
    }
}
