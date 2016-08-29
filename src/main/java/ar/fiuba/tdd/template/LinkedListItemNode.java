package ar.fiuba.tdd.template;

/* Linked List Node that keep T item and has a reference to other Node. */
class LinkedListItemNode<T> implements LinkedListNode<T> {
    private LinkedListNode<T> nextNode = new LinkedListNullNode<>();
    private T item;

    LinkedListItemNode(T item) {
        this.item = item;
    }

    @Override
    public T getItem() {
        return item;
    }

    @Override
    public int getSize() {
        return (1 + nextNode.getSize());
    }

    @Override
    public LinkedListNode<T> getNextNode() {
        return nextNode;
    }

    @Override
    public void addNextNode(LinkedListNode<T> nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public void addLastNode(LinkedListNode<T> lastNode, LinkedListNode<T> previousNode) {
        nextNode.addLastNode(lastNode, this);
    }
}
