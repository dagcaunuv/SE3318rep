package org.example;
import java.util.List;
import java.util.ArrayList;

class WizardExam {
    private List<String> requiredSpells;

    public WizardExam(List<String> requiredSpells) {
        this.requiredSpells = requiredSpells;
    }

    public boolean pass(HogwartsStudent student) {
        for (String spell : requiredSpells) {
            if (!student.knowsSpell(spell)) return false;
        }
        return true;
    }
}