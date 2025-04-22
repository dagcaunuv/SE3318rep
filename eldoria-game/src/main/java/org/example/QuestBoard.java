package org.example;

public class QuestBoard implements Questable {

    @Override
    public void acceptQuest(String questName) {
        System.out.println("Quest accepted: " + questName);
    }
}