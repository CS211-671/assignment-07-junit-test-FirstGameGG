package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student s1;

    @BeforeEach
    void init(){
        s1 = new Student("6610402001", "First");
    }

    @Test
    void testAddScore(){
        s1.addScore(40);
        assertEquals(40,s1.getScore());
        s1.addScore(30);
        assertEquals(70,s1.getScore());
    }

    @Test
    void testCalculateGrade(){
        s1.addScore(10);
        assertEquals("C",s1.grade());
    }

    @Test
    void testChangeName(){
        s1.changeName("NewName");
        assertEquals("NewName",s1.getName());

        String oldName = s1.getName();
        s1.changeName("   ");
        assertEquals(oldName, s1.getName());
    }

    @Test
    void testIsId(){
        assertTrue(s1.isId("6610402001"));
        assertFalse(s1.isId("6610402002"));
    }
}