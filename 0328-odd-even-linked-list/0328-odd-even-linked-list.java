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

        if(head==null || head.next==null) return head;

        ListNode temp = head;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode head2 = head.next;

        int count = 0;

        while (temp != null) {
            count++;

            if (count >= 3 && count % 2 == 1) {
                odd.next = temp;
               // System.out.println(odd.val);
                odd = odd.next;

            } else if (count >= 3 && count % 2 == 0) {
                even.next = temp;
                //System.out.println(even.val);
                even = even.next;
            }

            temp = temp.next;
        }
        even.next=null;

        odd.next = head2;

        return head;

    }
}