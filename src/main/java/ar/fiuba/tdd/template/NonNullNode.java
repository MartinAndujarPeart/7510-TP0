package ar.fiuba.tdd.template;

/**
 * Created by martin on 27/08/16.
 */
public class NonNullNode<T> extends Node {

    private Node next;
    private T value;

    NonNullNode() {
        this.next = new NullNode();
    }


    NonNullNode(T value) {
        this.value = value;
        this.next = new NullNode();
    }

    public void addNext(Node next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public int iterateThroughNodesUntilLastOccurence() {
        return 1 + this.next.iterateThroughNodesUntilLastOccurence();
    }

}
