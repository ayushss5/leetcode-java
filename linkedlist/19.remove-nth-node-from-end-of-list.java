/*
 * @lc app=leetcode id=19 lang=java
 *
 * [19] Remove Nth Node From End of List
 */

// @lc code=start
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
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode current = dummy;
        int size =0;
        while(current.next!=null){
            current = current.next;
            size++;
        }
        current=dummy;
        for(int i=0;i<size-n;i++){
            current = current.next;
        }
        current.next = current.next.next;
        return dummy.next;
    }
}
// @lc code=end

