package me.linkedlists;

public class _29DeleteMiddleElement {
    public ListNode deleteMiddle(ListNode head) {

        // handle 1 & 2 nodes to make delete seemlessly
        if(head.next==null){
            return null;
        }
        if (head.next.next==null){
            head.next=null;
            return head;
        }

        // create two pointers with different paces
        ListNode fastPace = head;
        ListNode slowPace = head;
        ListNode beforeMidNode = null;

        // finding middle point with slow pace
        while (fastPace != null && fastPace.next != null){
            fastPace = fastPace.next.next;
            beforeMidNode = slowPace;
            slowPace = slowPace.next;

        }
        // delete node
        beforeMidNode.next = slowPace.next;
        return head;

    }
}



