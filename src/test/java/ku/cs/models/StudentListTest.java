package ku.cs.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    @Test
    void addNewStudent() {
        StudentList list = new StudentList();
        list.addNewStudent("661040XXX1", "John Doe", 50);
        list.addNewStudent("661040XXX2", "Jane Doe", 90);

        assertEquals(2, list.getStudents().size());
    }

    @Test
    void findStudentById() {
        StudentList list = new StudentList();
        list.addNewStudent("661040XXX1", "John Doe", 50);
        list.addNewStudent("661040XXX2", "Jane Doe", 90);

        assertNotEquals(null, list.findStudentById("661040XXX1"));
        assertNotEquals(null, list.findStudentById("661040XXX2"));
        assertNull(list.findStudentById("661040XXX3"));
    }

    @Test
    void giveScoreToId() {
        StudentList list = new StudentList();
        list.addNewStudent("661040XXX1", "John Doe", 50);
        list.addNewStudent("661040XXX2", "Jane Doe", 90);

        list.giveScoreToId("661040XXX2", 10);
        Student s2 = list.findStudentById("661040XXX2");
        assertEquals(100, s2.getScore());
    }

    @Test
    void viewGradeOfId() {
        StudentList list = new StudentList();
        list.addNewStudent("661040XXX1", "John Doe", 50);
        list.addNewStudent("661040XXX2", "Jane Doe", 90);

        assertEquals("D", list.viewGradeOfId("661040XXX1"));
        assertEquals("A", list.viewGradeOfId("661040XXX2"));
    }
}