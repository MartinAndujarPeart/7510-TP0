package ar.fiuba.tdd.template;

/**
 * Created by martin on 27/08/16.
 */
class LinkedList<T> {

    private Node<T> first;

    LinkedList() {
        first = new NullNode<>();
    }

    LinkedList(T value) {
        first = new NonNullNode<>(value);
    }

    public T peekLast() {
        return (first.last()).getValue();
    }

    public T getFirstValue() {
        return first.getValue();
    }

    public void remove() {
        first = first.remove();
    }

    public int size() {
        return first.getSize();
    }

    public void add(T value) {
        if ( first.getSize() == 0) {
            first = new NonNullNode<>(value);
        } else {
            first.last().addNext(new NonNullNode<>(value));
        }
    }


}
