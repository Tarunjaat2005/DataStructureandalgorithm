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
        if(head == null || head.next == null) {
				return head;
			}
			
			ListNode mid = middle(head);
			ListNode half1 = head;
			ListNode half2 = mid.next;
			mid.next = null;
			
			half1 = sortList(half1);
			half2 = sortList(half2);
			
			ListNode finalHead = Merge(half1, half2);
			return finalHead;
        
    }
    private ListNode middle(ListNode head){
			if(head == null) {
				return head;
			}
			ListNode slowNode = head;
			ListNode fastNode = head;
			
			while(fastNode.next != null && fastNode.next.next != null) {
				slowNode = slowNode.next;
				fastNode = fastNode.next.next;
			}
			return slowNode;
		}

        public ListNode Merge(ListNode headNode1 , ListNode headNode2){
			// Edge Cases
			if(headNode1 == null) {
				return headNode2;
			}
			if(headNode2 == null) {
				return headNode1;
			}
			ListNode t1 = headNode1 , t2 = headNode2;
			ListNode head = null, tail = null;
			//Compare elements of both lists for first Nodes
			if(t1.val <= t2.val) {
				head = t1;
				tail = t1;
				t1 = t1.next;
				
			}else {
				head = t2;
				tail = t2;
				t2 = t2.next;
			}
			// Moving to next Nodes and head remain calm and stayed and all the elements are store in tail side and tail.next and new tail will be updated time to time
			while(t1 != null && t2 != null) {
				if(t1.val <= t2.val) {
					tail.next = t1;
					tail = t1;
					t1 = t1.next;
				}else {
					tail.next = t2;
					tail = t2;
					t2 = t2.next;
				}
			}
			// if loop is over or one list is empty then append all the values of second node in tail
			if(t1 != null) {
				tail.next = t1;
			}else {
				tail.next = t2;
			}
			return head;
			
			
		}

}