package solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerTest {

    @Test
    void reverse() {
        assertEquals(321, ReverseInteger.reverse(123));
        assertEquals(4321, ReverseInteger.reverse(12340));
        assertEquals(-19, ReverseInteger.reverse(-910));
        assertEquals(0, ReverseInteger.reverse(1534236469));
    }
}