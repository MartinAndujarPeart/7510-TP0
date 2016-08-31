package ar.fiuba.tdd.template;

class NullNode<T> extends Node<T> {

    private Node<T> genericNode;

    NullNode() {
        genericNode = this;
    }

    public int getSize() {
        return genericNode.getSizeByType();
    }

    @Override
    public int getSizeByType() {
        return 0;
    }

    @Override
    public Node<T> iterateThroughNodesUntilLastOccurrence(Node<T> node) {
        return node;
    }

    @Override
    public T getValue() {
        return genericNode.getValueByType();
    }

    @Override
    public T getValueByType() {
        throw new AssertionError("The element has no values");
    }

    @Override
    public void addNext(Node<T> next) {
        genericNode = next;
    }

    @Override
    public Node<T> remove() {
        return genericNode.removeByType();
    }

    @Override
    public Node<T> removeByType() {
        throw new AssertionError("Trying to remove an empty element");
    }


    @Override
    public Node<T> last() {
        return genericNode.iterateThroughNodesUntilLastOccurrence(genericNode);
    }

}
