class Solution {
    public int heightChecker(int[] heights) {

        int[] copy = new int[heights.length];
        System.arraycopy(heights, 0, copy, 0, heights.length);
        Arrays.sort(heights);
        for (int n : copy) {
            System.out.print(n);
        }

        int countDoesntMatch = 0;
        for (int i = 0; i < heights.length; i++) {
            if (copy[i] != heights[i]) {
                countDoesntMatch++;
            }
        }
        return countDoesntMatch;
    }
}

/*
    brute force:
    store sorted and before
    compare and count up
*/