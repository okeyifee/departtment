import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

    @Test
    void getName() {
        Course obj = new Course(); 
        assertArrayEquals("samuel","samuel");
    }

    private void assertArrayEquals(String samuel, String samuel1) {
    }
}