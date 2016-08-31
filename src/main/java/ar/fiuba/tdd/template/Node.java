package ar.fiuba.tdd.template;


abstract class Node<T> {

    abstract int getSize();

    abstract Node<T> iterateThroughNodesUntilLastOccurrence(Node<T> node);

    abstract void addNext(Node<T> next);

    abstract Node<T> remove();

    abstract T getValue();

    abstract Node<T> last();

    abstract Node<T> removeByType();

    abstract T getValueByType();

    abstract int getSizeByType();
}
