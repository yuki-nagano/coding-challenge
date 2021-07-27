/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {

        if (head == null) {
            return false;
        }

        ListNode rabbit = head;
        ListNode turtle = head;

        while (rabbit.next != null) {
            if (rabbit.val == turtle.val) {
                return true;
            }
            rabbit = rabbit.next.next;
            turtle = turtle.next;
        }
        return false;
    }
}
/*
Note:
    ListNode rabbit : move every 2 nodes
    ListNode turtle : move one by one
*/