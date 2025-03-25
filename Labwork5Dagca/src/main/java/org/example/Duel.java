package org.example;
import java.util.List;


class Duel {
    public static void start(HogwartsStudent s1, HogwartsStudent s2, String spell) {
        if (!s1.knowsSpell(spell) && !s2.knowsSpell(spell)) {
            System.out.println("It's a draw!");
        } else if (s1.knowsSpell(spell) && !s2.knowsSpell(spell)) {
            System.out.println(s1.getName() + " wins!");
        } else if (!s1.knowsSpell(spell) && s2.knowsSpell(spell)) {
            System.out.println(s2.getName() + " wins!");
        } else {
            System.out.println("Random magic duel!");
        }
    }
}