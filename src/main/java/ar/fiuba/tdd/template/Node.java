package ar.fiuba.tdd.template;

/**
 * Created by martin on 28/08/16.
 */


public abstract class Node<T> {

    abstract int getSize();

    abstract T iterateThroughNodesUntilLastOccurrence(Node<T> node);

    abstract void addNext(Node<T> next);

    abstract Node<T> remove();

    abstract T getValue();

    abstract T last();

}
