package ar.fiuba.tdd.template;

/* ItemQueue is a Queue that can keep T items */
class ItemQueue<T> implements Queue<T> {
    private LinkedList<T> linkedList;

    public ItemQueue() {
        linkedList = new LinkedList<>();
    }

    public boolean isEmpty() {
        return linkedList.size() == 0;
    }

    public int size() {
        return linkedList.size();
    }

    public void add(T item) {
        linkedList.addLast(item);
    }

    public T top() throws AssertionError {
        return linkedList.top();
    }

    public void remove() throws AssertionError {
        linkedList.removeFirst();
    }
}
