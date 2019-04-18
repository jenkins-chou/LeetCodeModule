package com.jenking.simple;

/**
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 *
 * 示例 1:
 *
 * 输入: 1->1->2
 * 输出: 1->2
 * 示例 2:
 *
 * 输入: 1->1->2->3->3
 * 输出: 1->2->3
 */
public class DeleteDuplicates {
    public isPalindromeListNode.ListNode deleteDuplicates(isPalindromeListNode.ListNode head) {
        if(head==null)return null;
        isPalindromeListNode.ListNode p = head;
        while(p!=null && p.next !=null){
            if(p.val == p.next.val){
                p.next =p.next.next;
            }else{
                p = p.next;
            }
        }
        return head;
    }
}
