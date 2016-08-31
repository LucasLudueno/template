package ar.fiuba.tdd.template;

/* This class represent an empty Node, has neither items nor next Nodes  */
class LinkedListNullNode<T> implements LinkedListNode<T> {

    @Override
    public T getItem() {
        throw new AssertionError();
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public LinkedListItemNode<T> getNextNode() {
        throw new AssertionError();
    }

    @Override
    public void addNextNode(LinkedListNode<T> nextNode) { }

    @Override
    public void addLastNode(LinkedListNode<T> lastNode, LinkedListNode<T> previousNode) {
        previousNode.addNextNode(lastNode);
    }
}
