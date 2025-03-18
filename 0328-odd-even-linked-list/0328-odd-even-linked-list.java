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
    public ListNode oddEvenList(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return head;
        ListNode temp1=head;
        ListNode temp2=temp1.next;
        ListNode even=temp2;

        while(temp1.next!=null && even.next!=null){
            temp1.next=even.next;
            temp1=temp1.next;
            even.next=temp1.next;
            even=even.next;
        }

        temp1.next=temp2;

        return head;
        
    }
}