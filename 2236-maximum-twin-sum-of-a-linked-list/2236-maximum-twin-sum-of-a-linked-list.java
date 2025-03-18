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
    public int pairSum(ListNode head) {
        int maxi=Integer.MIN_VALUE;
        ListNode temp1=head;

        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode curr=slow;
        ListNode prev=null;
        ListNode nex=null;

        while(curr!=null){
            nex=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nex;
           

        }

        ListNode temp2=prev;


        while(temp1!=null && temp2!=null){
            int sum=temp1.val+temp2.val;

            maxi=Math.max(sum,maxi);
            temp1=temp1.next;
            temp2=temp2.next;
        }




return maxi;

        
    }
}