package com.jenking.simple;

/**
 * 请判断一个链表是否为回文链表。
 *
 * 示例 1:
 *
 * 输入: 1->2
 * 输出: false
 * 示例 2:
 *
 * 输入: 1->2->2->1
 * 输出: true
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class isPalindromeListNode {
    public static boolean isPalindrome(ListNode head) {
        int len = 0;
        ListNode tempNode = head;
        while (tempNode!=null){
            len++;
            tempNode = tempNode.next;
        }

        tempNode = head;
        ListNode[] listNodes = new ListNode[len];
        for (int i = 0;i<len;i++){
            listNodes[i] = tempNode;
            tempNode = tempNode.next;

            System.out.println(listNodes[i].val);
        }

        for (int i = 0;i<len/2;i++){
            if (listNodes[i].val != listNodes[len-i-1].val){
                return false;
            }
        }

        return true;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void main(String args[]){
        ListNode head = new ListNode(0);
        ListNode chil1 = new ListNode(1);
        ListNode chil2 = new ListNode(1);
        ListNode chil3 = new ListNode(0);
        head.next = chil1;
        chil1.next = chil2;
        chil2.next = chil3;

        System.out.println(isPalindrome(head));
    }

}


