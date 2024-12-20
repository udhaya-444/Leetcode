/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ArrayList<ListNode> val1=new ArrayList<>();
        ArrayList<ListNode> val2=new ArrayList<>();
        
        while(headA!=null)
        {
            val1.add(headA);
            headA=headA.next;
        }
        while(headB!=null)
        {
            val2.add(headB);
            headB=headB.next;
        }
        int i=val1.size()-1;
        int j=val2.size()-1;
        ListNode ln=null;
        while(i>=0 && j >=0)
        {
            if(val1.get(i)==val2.get(j))
            {
                       ln=val1.get(i);
            }
            else
            {
                break;
            }
            i--;
            j--;
        }
        return ln;

    }
}