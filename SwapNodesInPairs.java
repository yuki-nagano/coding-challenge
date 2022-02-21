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
    public ListNode swapPairs(ListNode head) {
        return head;
    }
}

/*
Note:
    Input : [1,2,3,4]
    Output: [2,1,4,3]
    - recursion
        c-1-2-3-4-null move by 1
        p---2-3-4-null move by 2
        h-1-2-3-4-null

    ListNode c = head;

    // size is 1 which means theres no pair
    if head.next == null
        return head


    // size is 2+
    ListNode p = c.next.next;
    base case:
        reached last node
        if p.next == null
            return
        else if p.next.next
            return
    recursive case:
        helper(c, p)


    // doesn't work
    base case:
        reached last node
        if c.next.next == null
            return
    recursive case:
        c = c.next;
        helper(c.next)
        ListNode temp = c.next // 4-null
        c.next.val = c.val
        c.val = temp.val


*/