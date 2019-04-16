package com.jenking.simple;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 示例：
 *
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */
public class TwoNumAdd {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //long startTime = System.currentTimeMillis();

        if (l1==null||l2==null)return null;
        int carry = 0;
        ListNode result = new ListNode(0);
        ListNode p1 = l1,p2 = l2, pointNode = result;

        while (p1!=null||p2!=null){
            int stepSum = (p1 !=null?p1.val:0)+(p2!=null?p2.val:0)+carry;
            carry = stepSum /10;
            ListNode stepNode = new ListNode(stepSum % 10);

            pointNode.next = stepNode;
            pointNode = pointNode.next;

            p1 = p1!=null?p1.next:null;
            p2 = p2!=null?p2.next:null;
        }

        if (carry>0){
            pointNode.next = new ListNode(carry);
        }

        //long stopTime = System.currentTimeMillis();
        //System.out.println("花费时间："+(stopTime-startTime)+"ms");
        return result.next;
    }

    public static void main(String args[]){
        ListNode l1 = new ListNode(2);
        ListNode l1_1 = new ListNode(4);
        ListNode l1_2 = new ListNode(3);
        l1.next = l1_1;
        l1_1.next = l1_2;

        ListNode l2 = new ListNode(5);
        ListNode l2_1 = new ListNode(6);
        ListNode l2_2 = new ListNode(4);
        l2.next = l2_1;
        l2_1.next = l2_2;

        ListNode result = addTwoNumbers(l1,l2);
        System.out.println(result);
        while (result!=null){
            System.out.println(result.val);
            result = result.next;
        }

    }
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}



