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
 // 题目描述

class Solution {
    public ListNode reverseList(ListNode head) {
       ListNode pre = null;     // 当前节点的前继节点
       ListNode curr = head;    // 当前节点
       while( curr != null) {
           ListNode tmp = curr.next;    //临时节点tmp,将当前节点的后继节点赋值给tmp
           curr.next = pre; //当前节点指向前面元素
           pre = curr;  // pre指向当前元素
           curr = tmp;  // curr指向它的后继节点
       }
       return pre;
    }
}