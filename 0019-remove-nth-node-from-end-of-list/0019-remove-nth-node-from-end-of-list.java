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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int length = 0 ;
        while(temp != null){
            temp = temp.next;
            length++;
        }
        temp = head;
        if(n == length){
            return head.next;
        }
        int j = 0;
        while(j < length - n - 1){
            temp = temp.next;
            j++;
        }
        temp.next = temp.next.next;
        return head;
    }
}