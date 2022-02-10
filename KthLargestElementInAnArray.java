class Solution {
    public int findKthLargest(int[] nums, int k) {
        if (nums.length == 1) {
            return nums[0];
        }

        // Queue<Integer> minHeap = new PriorityQueue<>();
        Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int n : nums) {
            maxHeap.add(n);
        }

        System.out.println(maxHeap);
        for (int i = 0; i < maxHeap.size(); i++) {
            System.out.print(maxHeap.size());
            // if (i == k - 1) {
            //     return maxHeap.peek();
            // }
            System.out.print(maxHeap.poll());
        }
        return maxHeap.peek();
    }
}

                        6
                    /       \
                   5          4
                  /  \       /  \
                5     2     3    3
              /  \
             1    2