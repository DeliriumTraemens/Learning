package dataStructures.linkedlist;

public interface Linked<E> {
    void addFirst();

    void addLast();

    int size();

    E getElementByIndex(int counter);

}
