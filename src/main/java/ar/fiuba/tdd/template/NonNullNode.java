package ar.fiuba.tdd.template;


class NonNullNode<T> extends Node<T> {

    private Node<T> next = new NullNode<>();
    private T value;

    NonNullNode() {}

    NonNullNode(T value) {
        this.value = value;
    }

    public void addNext(Node<T> next) {
        this.next = next;
    }

    @Override
    public T getValue() {
        return value;
    }

    @Override
    public Node<T> last() {
        return iterateThroughNodesUntilLastOccurrence(this);
    }

    @Override
    public Node<T> remove() {
        return this.next;
    }

    @Override
    public Node<T> removeByType() {
        return remove();
    }

    @Override
    public T getValueByType() {
        return getValue();
    }

    @Override
    public int getSizeByType() {
        return getSize();
    }

    @Override
    public int getSize() {
        return 1 + this.next.getSize();
    }

    @Override
    Node<T> iterateThroughNodesUntilLastOccurrence(Node<T> node) {
        return this.next.iterateThroughNodesUntilLastOccurrence(this);
    }

}
