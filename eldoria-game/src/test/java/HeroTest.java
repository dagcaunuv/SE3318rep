package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HeroTest {

    @Test
    void testHeroSpeak() {
        Hero hero = new Hero("Arthur", 10);
        assertEquals("Arthur", hero.getName());
        assertEquals(10, hero.getLevel());
    }
}
