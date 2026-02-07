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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode curr = head , reversedHead = null , linkSaver = null;
        while(curr != null){
            linkSaver = curr.next;
            curr.next = reversedHead;
            reversedHead = curr;
            curr = linkSaver;
        }
        return reversedHead;
    }
}