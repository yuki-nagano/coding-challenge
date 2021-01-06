package solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddBinaryTest {

    @Test
    void addBinary() {
        assertEquals("100", AddBinary.addBinary("11", "1"));
    }
}
