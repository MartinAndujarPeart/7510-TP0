package ar.fiuba.tdd.template;

import org.junit.Assert;
import org.junit.Test;


public class NodeTests {

    @Test
    public void successCreateNode() {
        Assert.assertNotEquals(new NonNullNode(), null);
    }


    @Test
    public void countNodes() {

        NonNullNode<Integer> node1 = new NonNullNode<>();
        NonNullNode<Integer> node2 = new NonNullNode<>();
        NonNullNode<Integer> node3 = new NonNullNode<>();
        NonNullNode<Integer> node4 = new NonNullNode<>();


        node1.addNext(node2);
        node2.addNext(node3);
        node3.addNext(node4);

        Assert.assertTrue(node1.getSize() == 4);
    }

    @Test
    public void getValue() {

        int valueTest = 2;
        NonNullNode<Integer> nodeTest = new NonNullNode<>(valueTest);

        Assert.assertEquals((Integer)2,nodeTest.getValue());
    }

    @Test(expected = AssertionError.class)
    public void throwExceptionWhenGetValueFromNullNode() {
        NullNode<Integer> nodeTest = new NullNode<>();
        nodeTest.getValue();
    }

}
