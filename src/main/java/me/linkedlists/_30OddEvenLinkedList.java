package me.linkedlists;


public class _30OddEvenLinkedList {

    public ListNode oddEvenList(ListNode head) {
        // handle edge case n = 0, 1, 2
        if(head == null || head.next == null || head.next.next == null){
            return head;
        }
        // create two pointers with different paces
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;
        // finding middle point with slow pace
        while ( even != null && even.next != null){
            odd.next = odd.next.next;
            odd = odd.next;
            even.next = even.next.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }

    public static void main(String[] args) {
        _30OddEvenLinkedList oddEven = new _30OddEvenLinkedList();
        ListNode nodes = new ListNode(new int[]{1,2,3,4,5});
        //System.out.println(nodes.toString());

        System.out.println(oddEven.oddEvenList(nodes));
    }
}

