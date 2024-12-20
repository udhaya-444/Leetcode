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
    public ListNode middleNode(ListNode head) {
        ListNode slop=head;
        ListNode fasp=head;
        while(fasp!=null && fasp.next!=null)
        {
            slop=slop.next;
            fasp=fasp.next.next;
        }
        return slop;
    }
}