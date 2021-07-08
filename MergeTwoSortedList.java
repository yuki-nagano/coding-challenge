/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //   p   c
        // l1 = [1,2,4]
        //       | t
        // l2 = [1,3,4]
        //       c
        // pre: track the previous node
        // cur: now

        // if l1.cur <= l2.cur (ex. 1 vs. 1, 2 vs. 3),
        //  store the rest of l1.next to ListNode temp
        //  merge(change the pointer) of l2 to l1
        // l1.next, l2.next

        // else if l1.cur > l2.cur (ex. 3 vs. 2)
        //

    }
}