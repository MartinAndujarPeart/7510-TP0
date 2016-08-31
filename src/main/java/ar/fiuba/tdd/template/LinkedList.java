package ar.fiuba.tdd.template;


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
        first.last().addNext(new NonNullNode<>(value));
    }


}
