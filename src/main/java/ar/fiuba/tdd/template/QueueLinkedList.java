package ar.fiuba.tdd.template;


class QueueLinkedList<T> implements Queue<T> {

    private LinkedList<T> list;

    QueueLinkedList() {
        list = new LinkedList<>();
    }

    QueueLinkedList(T value) {
        list = new LinkedList<>(value);
    }

    @Override
    public boolean isEmpty() {
        return (list.size() == 0);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void add(T item) {
        list.add(item);
    }

    @Override
    public T top() {
        return list.getFirstValue();
    }

    @Override
    public void remove() {
        list.remove();
    }
}
