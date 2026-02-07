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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode mid = Middle(head);
        ListNode half1 = head , half2 = mid.next;
        mid.next = null;
        half1 = sortList(half1);
        half2 = sortList(half2);
        ListNode finalhead = merge(half1 , half2);
        return finalhead;
    }
    private ListNode Middle(ListNode head){
        ListNode slow = head , fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private ListNode merge(ListNode h1 , ListNode h2){
        if(h1 == null){
            return h2;
        }
        if(h2 == null){
            return h1;
        }

        ListNode head = null ,tail = null;

        if(h1.val <= h2.val){
            head = h1;
            tail = h1;
            h1 = h1.next;
        }else{
            head = h2;
            tail = h2;
            h2 = h2.next;
        }

        while(h1 != null && h2 != null){
            if(h1.val <= h2.val){
                tail.next = h1;
                tail = h1;
                h1 = h1.next;
            }else{
                tail.next = h2;
                tail = h2;
                h2 = h2.next;
            }
        }
        if(h1 != null){
            tail.next = h1;
        }else{
            tail.next = h2;
        }
        return head;
    }
}