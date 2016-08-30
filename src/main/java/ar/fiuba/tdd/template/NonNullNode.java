package ar.fiuba.tdd.template;


public class NonNullNode<T> extends Node<T> {

    private Node<T> next;
    private T value;

    NonNullNode() {
        this.next = new NullNode<>();

    }

    NonNullNode(T value) {
        this.value = value;
        this.next = new NullNode<>();
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
    public int getSize() {
        return 1 + this.next.getSize();
    }

    @Override
    public Node<T> iterateThroughNodesUntilLastOccurrence(Node<T> node) {
        return this.next.iterateThroughNodesUntilLastOccurrence(this);
    }

}
