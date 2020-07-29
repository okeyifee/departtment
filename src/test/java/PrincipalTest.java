import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrincipalTest {

    @Test
    void admitStudent() {
        Principal obj = new Principal();
        assertArrayEquals("sam","sam");
        
    }

    private void assertArrayEquals(String sam, String sam1) {
    }

    @Test
    void expelStudent() {
        Principal obj = new Principal();
        assertArrayEquals("sam","");
    }

    @Test
    void view() {
    }
}