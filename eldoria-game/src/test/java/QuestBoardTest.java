package org.example;

import org.junit.jupiter.api.Test;

class QuestBoardTest {

    @Test
    void testAcceptQuest() {
        QuestBoard board = new QuestBoard();
        board.acceptQuest("Rescue the villagers");
    }
}
