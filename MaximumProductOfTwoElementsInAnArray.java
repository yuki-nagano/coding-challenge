class Solution {
    public int maxProduct(int[] nums) {
        Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int k = 0; k < nums.length; k++) {
            maxHeap.add(nums[k]);
        }

        int i = maxHeap.poll() - 1;
        int j = maxHeap.poll() - 1;

        return i*j;
    }
}
/*
- find the maximum value of index - 1 * index - 1
- add nums[i] to pq
- int i = pq.poll(), int j = pq.poll()
- math(i-1*j-1)
- compare with the result(default:MINVALUE) and update

[test]
minHeap.toString() -> [1,4,0] but you can see min with peek
minHeap.add(1);
System.out.println(minHeap.peek()); // 1
minHeap.add(4);
System.out.println(minHeap.peek()); // 1
minHeap.add(0);
System.out.println(minHeap.peek()); // 0
*/