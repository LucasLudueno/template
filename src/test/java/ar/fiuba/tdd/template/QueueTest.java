package ar.fiuba.tdd.template;

import org.junit.Test;

public class QueueTest {

    @Test
    // Test if Queue add elements correctly after remove
    public void addAfterRemoveTest() {
        ItemQueue<Integer> queue = new ItemQueue<>();
        queue.add(1);
        queue.add(1);
        queue.add(1);
        queue.remove();
        queue.remove();
        queue.remove();
        queue.add(2);
        assert (queue.top() == 2);
    }

    @Test
    // Test if Queue remove elements correctly
    public void removeElementsTest() {
        ItemQueue<Integer> queue = new ItemQueue<>();
        queue.add(1);
        assert (queue.size() == 1);
        queue.remove();
        assert (queue.size() == 0);
    }

    @Test
    // Test if Queue add elements correctly
    public void addElementsTest() {
        ItemQueue<Integer> queue = new ItemQueue<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        assert (queue.top() == 1);
        queue.remove();
        assert (queue.top() == 2);
        queue.remove();
        assert (queue.top() == 3);
    }

    @Test
    // Test Queue size method
    public void sizeTest() {
        ItemQueue<Integer> queue = new ItemQueue<>();
        queue.add(1);
        assert (queue.size() == 1);
        queue.add(2);
        assert (queue.size() == 2);
        queue.add(3);
        assert (queue.size() == 3);
    }

    @Test
    // Test Queue isEmpty method
    public void isEmptyTest() {
        ItemQueue<Integer> queue = new ItemQueue<>();
        assert (queue.isEmpty());
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.remove();
        queue.remove();
        queue.remove();
        assert (queue.isEmpty());
    }

    @Test(expected = AssertionError.class)
    // Test: Remove method should throws AssertionError when Queue is empty
    public void removeWhenQueueIsEmptyTest() {
        ItemQueue<Integer> queue = new ItemQueue<>();
        assert (queue.isEmpty());
        queue.remove();
    }

    @Test(expected = AssertionError.class)
    // Test: Top method should throws AssertionError when Queue is empty
    public void topWhenQueueIsEmptyTest() {
        ItemQueue<Integer> queue = new ItemQueue<>();
        assert (queue.isEmpty());
        queue.top();
    }
}
