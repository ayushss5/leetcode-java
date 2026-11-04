/*
 * @lc app=leetcode id=234 lang=java
 *
 * [234] Palindrome Linked List
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
    public boolean isPalindrome(ListNode head) {
        ListNode beg = head;
        ListNode current = head;
        while(current!=null&&current.next!=null){
            beg = beg.next;
            current=current.next.next;
        }
        current=beg;
        beg = head;
        ListNode prev = null;
        while(current != null){
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        while(prev!=null){
            if(beg.val==prev.val){
                beg = beg.next;
                prev = prev.next;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

