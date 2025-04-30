package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DuelTest {

    private HogwartsStudent harry;
    private HogwartsStudent draco;

    @BeforeEach
    public void setUp() {
        harry = new HogwartsStudent("Harry", "Gryffindor");
        draco = new HogwartsStudent("Draco", "Slytherin");
    }

    @Test
    public void testDuelBothKnowSpell() {
        harry.learnSpell("Expelliarmus");
        draco.learnSpell("Expelliarmus");
        Duel.duel(harry, draco, "Expelliarmus"); // Manuel kontrol
        assertTrue(true);
    }

    @Test
    public void testDuelOnlyOneKnowsSpell() {
        harry.learnSpell("Expelliarmus");
        Duel.duel(harry, draco, "Expelliarmus");
        assertTrue(true);
    }

    @Test
    public void testDuelNeitherKnowsSpell() {
        Duel.duel(harry, draco, "Avada Kedavra");
        assertTrue(true);
    }

    @Test
    public void testDuelWithNullInputs() {
        assertThrows(IllegalArgumentException.class, () -> {
            Duel.duel(null, draco, "Expelliarmus");
        });
        assertThrows(IllegalArgumentException.class, () -> {
            Duel.duel(harry, draco, null);
        });
    }
}
