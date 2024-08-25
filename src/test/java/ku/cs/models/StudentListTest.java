package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentListTest {
    @Test
    @DisplayName("Add student Test")
    void testAddStudent(){
        StudentList students = new StudentList();
        students.addNewStudent("6610450001", "mmm");

        Student s = students.findStudentById("6610450001");
        assertEquals("mmm", s.getName());
    }

    @Test
    @DisplayName("Find Student Test")
    void testFindStudent(){
        StudentList students = new StudentList();
        students.addNewStudent("6610450001", "mmm");
        students.addNewStudent("6610450002", "nnn");
        students.addNewStudent("6610450003", "ppp");

        Student s = students.findStudentById("6610450001");
        assertEquals("mmm", s.getName());
    }

    @Test
    @DisplayName("Give score test")
    void testGiveScore(){
        StudentList students = new StudentList();
        students.addNewStudent("6610450001", "mmm");
        students.addNewStudent("6610450002", "nnn");
        students.addNewStudent("6610450003", "ppp");

        students.giveScoreToId("6610450003", 90.50);
        double expected = 90.5;
        double actual = students.findStudentById("6610450003").getScore();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("View grade test")
    void testViewScore(){
        StudentList students = new StudentList();
        students.addNewStudent("6610450001", "mmm");
        students.addNewStudent("6610450002", "nnn");
        students.addNewStudent("6610450003", "ppp");

        students.giveScoreToId("6610450003", 90.50);
        String expected = "A";
        String actual = students.viewGradeOfId("6610450003");
        assertEquals(expected, actual);
    }
}