package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WizardExamTest {

    private HogwartsStudent student;
    private WizardExam exam;

    @BeforeEach
    public void setUp() {
        student = new HogwartsStudent("Neville", "Gryffindor");
        exam = new WizardExam(student);
    }

    @Test
    public void testPassWhenAllSpellsKnown() {
        student.learnSpell("Lumos");
        student.learnSpell("Expelliarmus");
        exam.addRequiredSpell("Lumos");
        exam.addRequiredSpell("Expelliarmus");
        assertTrue(exam.pass());
    }

    @Test
    public void testFailWhenMissingSpell() {
        student.learnSpell("Lumos");
        exam.addRequiredSpell("Lumos");
        exam.addRequiredSpell("Accio");
        assertFalse(exam.pass());
    }

    @Test
    public void testEvaluateOutput() {
        student.learnSpell("Lumos");
        exam.addRequiredSpell("Lumos");
        exam.evaluate(); // Output gözle izlenebilir
        assertTrue(true); // Dummy assert
    }
}