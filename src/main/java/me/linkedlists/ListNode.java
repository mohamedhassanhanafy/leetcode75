package me.linkedlists;

public class ListNode {
    int val;
    me.linkedlists.ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, me.linkedlists.ListNode next) { this.val = val; this.next = next; }

    ListNode(int[] arr){
        if (arr.length > 0){
            this.val = arr[0];
            ListNode prev = this;
            for (int i = 1; i < arr.length; i++) {
                ListNode current = new ListNode(arr[i]);
                prev.next = current;
                prev = current;
            }
        }
    }

    @Override
    public String toString() {
        String list = "";
        ListNode itr = this;
        while (itr != null){
            list +=  itr.val+ " , ";
            itr = itr.next;
        }
        return list;
    }
}
