package org.example;
import org.example.Spelbook ;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SpellbookTest {

    private Spellbook spellbook;

    @BeforeEach
    public void setUp() {
        spellbook = new Spellbook();
        spellbook.addSpell("Alohomora");
        spellbook.addSpell("Lumos");
        spellbook.addSpell("Accio");
    }

    @Test
    public void testGetSpellByValidIndex() {
        assertEquals("Lumos", spellbook.getSpell(1));
    }

    @Test
    public void testGetSpellByInvalidIndex() {
        assertThrows(IndexOutOfBoundsException.class, () -> {
            spellbook.getSpell(10);
        });
    }

    @Test
    public void testGetSpellsByExactPrefix() {
        List<String> result = spellbook.getSpellsByPrefix("Alo");
        assertEquals(1, result.size());
        assertEquals("Alohomora", result.get(0));
    }

    @Test
    public void testGetSpellsByEmptyPrefix() {
        List<String> result = spellbook.getSpellsByPrefix("");
        assertEquals(3, result.size());
    }

    @Test
    public void testGetSpellsByNoMatchPrefix() {
        List<String> result = spellbook.getSpellsByPrefix("XYZ");
        assertTrue(result.isEmpty());
    }
}
