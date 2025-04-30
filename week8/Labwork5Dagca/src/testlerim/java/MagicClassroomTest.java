package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.example.MagicClassroom ;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MagicClassroomTest {

    private MagicClassroom classroom;

    @BeforeEach
    public void setUp() {
        classroom = new MagicClassroom();
    }

    @Test
    public void testAddValidStudent() {
        HogwartsStudent student = new HogwartsStudent("Harry", "Gryffindor");
        classroom.addStudent(student);
        assertEquals(1, classroom.getAllStudents().size());
    }

    @Test
    public void testAddNullStudent() {
        classroom.addStudent(null);
        assertEquals(0, classroom.getAllStudents().size());
    }

    @Test
    public void testFindStudentByName() {
        HogwartsStudent student = new HogwartsStudent("Hermione", "Gryffindor");
        classroom.addStudent(student);
        assertEquals(student, classroom.findStudentByName("Hermione"));
    }

    @Test
    public void testFindStudentsBySpell() {
        HogwartsStudent student = new HogwartsStudent("Ron", "Gryffindor");
        student.learnSpell("Lumos");
        classroom.addStudent(student);
        List<HogwartsStudent> result = classroom.findStudentsBySpell("Lumos");
        assertEquals(1, result.size());
    }

    @Test
    public void testListStudentsByHouse() {
        classroom.addStudent(new HogwartsStudent("A", "Hufflepuff"));
        classroom.addStudent(new HogwartsStudent("B", "Gryffindor"));
        classroom.addStudent(new HogwartsStudent("C", "Ravenclaw"));
        List<HogwartsStudent> sorted = classroom.listStudentsByHouse();
        assertEquals("Gryffindor", sorted.get(0).getHouse());
    }
}
