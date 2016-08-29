package ar.fiuba.tdd.template;

/* LinkedList that can keep T items */
class LinkedList<T> {
    private LinkedListFirstNode<T> first;

    LinkedList() {
        first = new LinkedListFirstNode<>();
    }

    int size() {
        return first.getSize();
    }

    // Add item in the first position.
    void addFist(T item) {
        first.addLastNode(new LinkedListItemNode<>(item), null);
    }

    // Return first item.
    T top() {
        return first.getItem();
    }

    // Remove the first item.
    void removeFirst() throws AssertionError {
        first.removeFirst();
    }
}
