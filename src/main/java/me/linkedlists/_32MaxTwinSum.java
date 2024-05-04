package me.linkedlists;

import java.util.LinkedList;

public class _32MaxTwinSum {

    public int pairSum(ListNode head) {

        //solution is to reverse the second half
        ListNode iter = head;

        // count number of elements (n/2) calculations as it is even number
        int numberOfHalfElements = 0;
        while (iter != null && iter.next != null){
            numberOfHalfElements++;
            iter = iter.next.next;
        }

        // find half element
        int i = numberOfHalfElements;
        iter = head;
        while (i  > 0){
            iter = iter.next;
            i --;
        }
        //reverse second half
        ListNode reversedHead = iter;
        ListNode prev = null;
        ListNode curr = reversedHead;
        ListNode temp = null;
        while (curr != null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        reversedHead = prev;

        // iterate through the 2 lists and return the max value
        i = numberOfHalfElements;
        int maxSum = Integer.MIN_VALUE;
        while (i > 0){
            if(head.val + reversedHead.val > maxSum){
                maxSum = head.val + reversedHead.val;
            }
            head = head.next;
            reversedHead = reversedHead.next;
            i--;
        }
        return maxSum;
    }

    public static void main(String[] args) {
        _32MaxTwinSum oddEven = new _32MaxTwinSum();
        ListNode nodes = new ListNode(new int[]{1,2,3,4,5,6});
        //System.out.println(nodes.toString());

        System.out.println(oddEven.pairSum(nodes));
    }
}
