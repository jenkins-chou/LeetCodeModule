package com.jenking.simple;

import java.util.List;

public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode head = result;
        ListNode p1 = l1;
        ListNode p2 = l2;

        while (p1!=null||p2!=null){
            int x = p1!=null?p1.val:0;
            int y = p2!=null?p2.val:0;

            if (p1==null){
                head.next = p2;
                head = p1;
                return result.next;
            }else if (p2==null){
                head.next = p1;
                head = p1;
                return result.next;
            }

            if (x==y){
                ListNode temp1 = new ListNode(x);
                ListNode temp2 = new ListNode(x);
                head.next = temp1;
                temp1.next = temp2;
                head = temp2;
                p1 = (p1!=null)?p1.next:p1;
                p2 = (p1!=null)?p2.next:p2;
            }else if (x<y){
                ListNode temp = new ListNode(x);
                head.next = temp;
                head = temp;
                p1 = (p1!=null)?p1.next:p1;

            }else if (y<x){
                ListNode temp = new ListNode(y);
                head.next = temp;
                head = temp;
                p2 = (p1!=null)?p2.next:p2;
            }
        }

        return result.next;
    }
    
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
}
