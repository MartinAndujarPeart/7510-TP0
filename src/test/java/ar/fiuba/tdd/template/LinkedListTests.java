package ar.fiuba.tdd.template;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTests {

    @Test
    public void successCreateLinkedList() {
        Assert.assertNotEquals(new LinkedList<>(),null);
    }

    @Test
    public void getValue() {
        LinkedList<Integer> list = new LinkedList<>(2);
        int value = 2;

        Assert.assertEquals(list.getFirstValue(),(Integer)value);

    }

    @Test(expected = AssertionError.class)
    public void emptyListHasNoValue() {
        LinkedList list = new LinkedList();

        list.getFirstValue();
    }

    @Test
    public void getCorrectSize() {
        LinkedList<Integer> list = new LinkedList<>();
        Assert.assertEquals(list.size(),0);
    }

    @Test(expected=AssertionError.class)
    public void removeEmptyNode() {
        LinkedList list = new LinkedList();
        list.remove();
    }


}
