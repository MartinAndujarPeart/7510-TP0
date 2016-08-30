package ar.fiuba.tdd.template;

public class NullNode<T> extends Node<T> {

    NullNode() {}

    public int getSize() {
        return 0;
    }

    @Override
    public Node<T> iterateThroughNodesUntilLastOccurrence(Node<T> node) {
        return node;
    }

    @Override
    public T getValue() {
        throw new AssertionError("The element has no values");
    }

    @Override
    public void addNext(Node<T> next) {
        throw new AssertionError("Trying to add next element to an empty element");
    }

    @Override
    public Node<T> remove() {
        throw new AssertionError("Trying to remove an empty element");
    }

    @Override
    public Node<T> last() {
        return this;
    }

}
