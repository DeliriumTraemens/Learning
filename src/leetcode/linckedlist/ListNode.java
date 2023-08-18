package leetcode.linckedlist;

public class ListNode {

private int value;
public ListNode next;

public ListNode(int value){
    this.value = value;
    this.next=null;
}
public ListNode(int value, ListNode next){
    this.value=value;
    this.next=next;
}

//SERVICE METHOD
    public static void printList(ListNode node){
    while(node!=null){
        System.out.println(node.value + "->");
        node=node.next;
    }
        System.out.println("null");
    }
//


}
