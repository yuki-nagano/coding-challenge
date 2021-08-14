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

        ListNode dummyHead = new ListNode(-1);
        ListNode cur = dummyHead;
        // continue until a and b are null
        while (l1 != null && l2 != null) {
            //compare a and b
            if (l1.val <= l2.val) {
                cur.next = l1;
                l1 = l1.next;
                cur = cur.next;
            } else if (l2.val < l1.val) {
                cur.next = l2;
                l2 = l2.next;
                cur = cur.next;
            }
        }
        cur.next = null == l1 ? l2:l1;
        return dummyHead.next;
    }
}

/*
[pseudo code]
        c a
d---1-2-4
    |/|/
    1-3-4
      c b

dummyHead -1(anything is okay but since the range of nodes is 0-50, choose -1)
curr = dummyHead(for chasing the tail of sorted one)

continue until a and b are null
    compare a and b {
        if a <= b,
            cur.next = a;
            a = a.next;
            cur = cur.next;
        if b < a,  cur.next = b
            cur.next = b;
            b = b.next;
            cur = cur.next;
    }
    *** while loop ends if either of l1 or l2 is null,
    so need to add other nodes that are not traversed ***
    if (cur.next == null) {
        if (l1 == null) {
            cur.next = l2;
        } else {
            cur.next = l1;
        }
    }
    shortly;
    cur.next = null == l1 ? l2:l1;

    return dummyHead
*/

/* 2nd attempt
        ListNode cur = l1;
        ListNode pre = l1;

                    $
                    c
            l1 = [1,2]
                  |
            l2 = [2,3]
                  p
                    $

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur = cur.next;
                pre.next = l2; // 1-2-3
                l1 = l1.next;
            } else if (l1.val == l2.val) {
                l2 = l2.next; // 3
                pre.next = cur; // 1-2-2
            }
        }
        return pre;

        // - l1cur.val = l2cur.val,
        //     cur2 = cur2.next (cur2: 3-4)
        //     prev.next = l1 (prev: 1-1-2-4)
        // - l1 > l2
    }
}
 */

 /* attempt 1 note:
     p   c
 l1 = [1,2,4]
       | t
 l2 = [1,3,4]
       c
 pre: track the previous node
 cur: now

 if l1.cur <= l2.cur (ex. 1 vs. 1, 2 vs. 3),
  store the rest of l1.next to ListNode temp
  merge(change the pointer) of l2 to l1
 l1.next, l2.next

 else if l1.cur > l2.cur (ex. 3 vs. 2)
  */
