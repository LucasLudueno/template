package ar.fiuba.tdd.template;

/* ItemQueue is a Queue that cant keep T items */
class ItemQueue<T> implements Queue<T> {
    private LinkedList<T> linkedList;

    ItemQueue() {
        linkedList = new LinkedList<>();
    }

    public boolean isEmpty() {
        return linkedList.size() == 0;
    }

    public int size() {
        return linkedList.size();
    }

    public void add(T item) {
        linkedList.addFist(item);
    }

    public T top() throws AssertionError {
        return linkedList.top();
    }

    public void remove() throws AssertionError {
        linkedList.removeFirst();
    }
}
