package ar.fiuba.tdd.template;

/* Queue is an interface for a Queue, that can keep T items,
 * remove and get them in the order they were placed. */
interface Queue<T> {
    boolean isEmpty();

    int size();

    // Add item in first position of Queue.
    void add(T item);

    // Return first item. If Queue is empty throws AssertionError.
    T top();

    // Remove first item. If Queue is empty throws AssertionError.
    void remove();
}

