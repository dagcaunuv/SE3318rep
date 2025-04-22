

package org.example;

import org.junit.jupiter.api.Test;

class MageTest {

    @Test
    void testMageCastSpellAndSpeak() {
        Mage mage = new Mage("Merlin", 12);
        mage.castSpell(); // Konsol çıktısı beklenir
        mage.speak();
    }

    @Test
    void testMageAcceptQuest() {
        Mage mage = new Mage("Gandalf", 15);
        mage.acceptQuest("Find the Staff of Power");
    }
}
