package dataStructures.linkedlist;

public class ListLink <E> implements Linked{

    private Node<E>fstNode;
    private Node<E>lstNode;
    private int size;

    public ListLink() {
        lstNode=new Node<E>(null,fstNode,null);
        fstNode=new Node<E>(null,null,fstNode);
    }

    @Override
    public void addFirst() {

    }

    @Override
    public void addLast() {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Object getElementByIndex(int counter) {
        return null;
    }

    private class Node<E>{
        private E currentElement;
        private Node<E>nextElement;
        private Node<E>prevElement;


        public Node(E currentElement, Node<E> prevElement, Node<E> nextElement) {
            this.currentElement = currentElement;
            this.prevElement = prevElement;
            this.nextElement = nextElement;
        }
    }
}
