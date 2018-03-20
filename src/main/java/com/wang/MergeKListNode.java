package com.wang;


import java.util.Arrays;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */



public class MergeKListNode {

    public static void main(String[] args){
        ListNode a = null;
        ListNode b = null;
        ListNode[] c = new ListNode[] {a,b};
        MergeKListNode mergeKListNode = new MergeKListNode();
        System.out.println(mergeKListNode.mergeKLists(c));

    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length==1){
            return lists[0];
        }else if (lists.length==2){
            return merge(lists[0], lists[1]);
        }else {
            int length = lists.length;
            return merge(mergeKLists(Arrays.copyOfRange(lists, 0, length/2)),
                    mergeKLists(Arrays.copyOfRange(lists, length/2, length)));
        }
    }

    public ListNode merge(ListNode x, ListNode y){
        ListNode i = x;
        ListNode j = y;
        ListNode k = new ListNode(0);
        ListNode temp = k;
        while (true){
            if (i==null){
                temp.next = j;
                break;
            }
            if (j==null){
                temp.next=i;
                break;
            }
            if (i.val>j.val){
                temp.next = new ListNode(j.val);
                j=j.next;
            }else if (i.val<= j.val){
                temp.next = new ListNode(i.val);
                i=i.next;
            }
            temp = temp.next;
        }
        return k.next;
    }
}

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){ val=x;}
}
