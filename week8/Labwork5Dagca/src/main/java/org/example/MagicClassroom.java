package org.example;
import java.util.ArrayList;
import java.util.List;
class MagicClassroom {
    private List<HogwartsStudent> students;

    public MagicClassroom() {
        students = new ArrayList<>();
    }

    public void addStudent(HogwartsStudent student) {
        if (student != null) students.add(student);
    }

    public HogwartsStudent findStudent(String name) {
        for (HogwartsStudent student : students) {
            if (student.getName().equals(name)) return student;
        }
        return null;
    }
}