package solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void twoSum() {
        // pre : 12345, 6
        // post: 0,4
        assertArrayEquals(new int[]{0,4}, TwoSum.twoSum(new int[]{1,2,3,4,5}, 6));

        // case 1
        // 12645, 10
        // 2,3
        assertArrayEquals(new int[]{2,3}, TwoSum.twoSum(new int[]{1,2,6,4,5}, 10));

        // case 2
        // 12, 3
        // 0,1
        assertArrayEquals(new int[]{0,1}, TwoSum.twoSum(new int[]{1,2}, 3));

        // case 3
        // 100,200,300 500
        // 1,2
        assertArrayEquals(new int[]{1,2}, TwoSum.twoSum(new int[]{100,200,300}, 500));
    }
}