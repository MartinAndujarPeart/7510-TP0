package ar.fiuba.tdd.template;

/**
 * Created by martin on 27/08/16.
 */
class LinkedList<T> {

    private Node<T> first;

    LinkedList() {
        first = new NullNode();
    }

    LinkedList(T value) {
        first = new NonNullNode(value);
    }

    public T peekLast() {
        return ((Node<T>)first.last()).getValue();
    }

    public T getFirstValue() {
        return first.getValue();
    }

    public void remove() {
        first.remove();
    }

    public int size() {
        return first.getSize();
    }

}
