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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null) return null;
        ListNode prev=null;
        ListNode current=head;

        for(int i=0;current!=null && i<left-1;i++){
            prev=current;
            current=current.next;
        }

        ListNode last=prev;
        ListNode newEnd=current;
        ListNode nt=null;


        for(int i=0;current!=null && i<right-left+1;i++){

            
            nt=current.next;
            current.next=prev;
            prev=current;
            current=nt;
        

        }

        if(last!=null)last.next=prev;
        else head=prev;
        newEnd.next=current;





      
        return head;


    



        
    }

   
}