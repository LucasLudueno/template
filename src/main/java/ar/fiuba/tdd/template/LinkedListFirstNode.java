package ar.fiuba.tdd.template;

/* This class represent the First Node of a Linked List. It has a reference to the Next Node, but hasn't got items */
class LinkedListFirstNode<T> implements LinkedListNode {
    private LinkedListNode<T> nextNode = new LinkedListNullNode<>();

    @Override
    public T getItem() {
        return nextNode.getItem();
    }

    @Override
    public int getSize() {
        return nextNode.getSize();
    }

    @Override
    public LinkedListNode<T> getNextNode() {
        return null;
    }

    @Override
    public void addNextNode(LinkedListNode nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public void addLastNode(LinkedListNode lastNode, LinkedListNode previousNode) {
        nextNode.addLastNode(lastNode, this);
    }

    public void removeFirst() {
        nextNode = nextNode.getNextNode();
    }
}
