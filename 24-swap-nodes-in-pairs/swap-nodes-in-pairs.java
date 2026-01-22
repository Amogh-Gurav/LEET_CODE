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
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode temp=dummy;

        while(temp.next!=null&&temp.next.next!=null){
            ListNode f=temp.next;
            ListNode s=temp.next.next;

            f.next=s.next;
            s.next=f;
            temp.next=s;
            temp=f;
        }
        return dummy.next;
    }
}