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
        HashMap<ListNode , Integer> hm=new HashMap<>();
        ListNode temp1=headA;
        ListNode temp2=headB;

        while(temp1!=null){
            hm.put(temp1,0);
            temp1=temp1.next;
        }

        while(temp2!=null){
            if(hm.get(temp2)!=null){
                return temp2;
            }
            temp2=temp2.next;
        }
        return null;


    }
}