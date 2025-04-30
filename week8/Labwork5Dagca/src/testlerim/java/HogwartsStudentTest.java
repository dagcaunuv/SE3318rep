

import org.example.HogwartsStudent ;



public class HogwartsStudentTest {

    private HogwartsStudent student;

    @BeforeEach
    public void setUp() {
        student = new HogwartsStudent("Harry", "Gryffindor");
    }

    @Test
    public void testLearnValidSpell() {
        student.learnSpell("Expelliarmus");
        assertTrue(student.knowsSpell("Expelliarmus"));
    }

    @Test
    public void testLearnNullSpell() {
        assertThrows(IllegalArgumentException.class, () -> {
            student.learnSpell(null);
        });
    }

    @Test
    public void testLearnDuplicateSpell() {
        student.learnSpell("Expelliarmus");
        student.learnSpell("Expelliarmus");
        List<String> spells = student.getSpells();
        long count = spells.stream().filter(s -> s.equals("Expelliarmus")).count();
        assertEquals(1, count);
    }

    @Test
    public void testKnowsSpellCorrectness() {
        student.learnSpell("Lumos");
        assertTrue(student.knowsSpell("Lumos"));
        assertFalse(student.knowsSpell("Nox"));
    }
}