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
    public void reorderList(ListNode head) {
        Stack<ListNode> stack=new Stack<>();
        ListNode temp=head;
        ListNode curr=head;
        int count=0;

        while(temp!=null){
            stack.add(temp);
            count++;
            temp=temp.next;
        }

        
        
 for(int i=0;i<count/2;i++){
    ListNode top=stack.pop();
    ListNode ne=curr.next;

    curr.next=top;
    top.next=ne;
    curr=ne;
 }

curr.next=null;
        
    }
}