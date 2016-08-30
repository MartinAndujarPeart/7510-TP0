package ar.fiuba.tdd.template;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by martin on 30/08/16.
 */
public class QueueLinkedListTests {

    @Test
    public void successCreateQueue() {
        QueueLinkedList queueTest = new QueueLinkedList();

        Assert.assertNotEquals(queueTest, null);
    }

    @Test
    public void addElement() {

        int []elements = {20,30,50,40,60};

        QueueLinkedList<Integer> queue = new QueueLinkedList<>();

        queue.add(elements[0]);
        queue.add(elements[1]);
        queue.add(elements[2]);
        queue.add(elements[3]);
        queue.add(elements[4]);

        Assert.assertEquals(queue.top(),(Integer)elements[0]);

        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();

        Assert.assertEquals(queue.top(),(Integer)elements[4]);

    }

    @Test
    public void topElement() {
        int testValue = 5;
        QueueLinkedList<Integer> queue = new QueueLinkedList<>(testValue);

        Assert.assertEquals(queue.top(),(Integer)5);

    }

    @Test(expected = AssertionError.class)
    public void removeFromEmptyQueue() {
        QueueLinkedList queue = new QueueLinkedList();
        queue.remove();
    }

    @Test(expected = AssertionError.class)
    public void topEmptyQueue() {
        QueueLinkedList queue = new QueueLinkedList();
        queue.top();
    }

}
