class Solution {

    public int perimeter;

    public int islandPerimeter(int[][] grid) {
        return helper(grid, 0, 0, perimeter);
    }

    private int helper(int[][] grid, int row, int col, int perimeter) {
        if (grid[row][col] == 0) {

        }
    }
}

/*
Note:
    grid = row x col
    1 means land
    0 means water
    ex.
    grid 2 x 2
    recurse
        - row or col is 0, 3 stripes (ex. grid[0][1] = 1 then get 3 stripes)
        - and left of 1 or down of 1 is 0, get 1,
        - and left of 1 or down of 1 is also 1, get 2

     _ _
    |0|1|
     - -
    |1|0| = 8

     _ _
    |0|1|
     - -
    |0|1| = 6

*/