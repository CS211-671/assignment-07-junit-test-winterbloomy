package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 45.15 คะแนน")
    void testAddScore(){
        Student s = new Student("6610451111", "Bell");
        s.addScore(45.15);
        assertEquals(45.15, s.getScore());

    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 85 คะแนน และให้ Object คำนวนเกรดออกมา")
    void testCalculateGrade(){
        Student s = new Student("6610451111", "Bell");
        s.addScore(85);
        assertEquals("A", s.grade());
    }

    @Test
    @DisplayName("เปลี่ยนชื่อ")
    void testChange(){
        Student s = new Student("6610451111", "Bell");
        s.changeName("Bow");
        assertEquals("Bow", s.getName());
    }

    @Test
    @DisplayName("id")
    void testIsId(){
        Student s = new Student("6610451111", "Bell");
        assertTrue(s.isId("6610451111"));
    }

    @Test
    @DisplayName("student info")
    void testStudentInfo(){
        Student s = new Student("6610451111", "Bell");
        assertEquals("6610451111", s.getId());
        assertEquals("Bell", s.getName());
    }
}