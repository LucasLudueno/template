package ar.fiuba.tdd.template;

/* Node Interface for LinkedList */
interface LinkedListNode<T> {
    T getItem();

    int getSize();

    LinkedListNode<T> getNextNode();

    void addNextNode(LinkedListNode<T> nextNode);

    // Add Node in the last position of the LinkedList
    void addLastNode(LinkedListNode<T> lastNode, LinkedListNode<T> previousNode);
}
