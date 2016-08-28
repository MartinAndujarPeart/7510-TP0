package ar.fiuba.tdd.template;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by martin on 28/08/16.
 */
public class NodeTest {

    @Test
    public void successCreateNode() {
        Assert.assertNotEquals(new NonNullNode<String>(), null);
    }


    @Test
    public void countNodes() {
        NonNullNode<String> node1 = new NonNullNode<>();
        NonNullNode<String> node2 = new NonNullNode<>();
        NonNullNode<String> node3 = new NonNullNode<>();
        NonNullNode<String> node4 = new NonNullNode<>();
        NonNullNode<String> node5 = new NonNullNode<>();

        node1.addNext(node2);
        node2.addNext(node3);
        node3.addNext(node4);
        node4.addNext(node5);

        Assert.assertTrue(node1.iterateThroughNodesUntilLastOccurence() == 5);
    }


}


