package org.example;

public class BattleManager {

    public static void battle(Hero hero, Enemy enemy) {
        System.out.println("Battle starts between " + hero.getName() + " and " + enemy.getName());

        if (hero.getLevel() >= enemy.getLevel()) {
            System.out.println(hero.getName() + " wins!");
        } else {
            System.out.println(enemy.getName() + " wins!");
        }
    }
}