package solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindUniqueNumberTest {

    @Test
    void findUniqueNumber() {
        assertEquals(5, FindUniqueNumber.findUniqueNumber(new int[]{1, 1, 3, 4, 5, 6}));
        assertEquals(0, FindUniqueNumber.findUniqueNumber(null));
        assertEquals(0, FindUniqueNumber.findUniqueNumber(new int[]{}));
        assertEquals(5, FindUniqueNumber.findUniqueNumber(new int[]{1, 2, 3, 4, 5, 5}));
        assertEquals(1, FindUniqueNumber.findUniqueNumber(new int[]{1}));
    }
}