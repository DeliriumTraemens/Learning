package leetcode.linckedlist;

public class MainRun {
    public static void main(String[] args) {
        ListNode head = ListNodeBuilderFullconstructor();
        ListNode.printList(head);
    }

    private static ListNode ListNodeBuilder() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

        ListNode head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        return head;
    }

    private static ListNode ListNodeBuilderFullconstructor() {
        ListNode head = new ListNode(1, new ListNode(2,new ListNode(3,new ListNode(4))));
        return head;
    }

}
