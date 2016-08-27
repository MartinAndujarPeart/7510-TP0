package ar.fiuba.tdd.template;

/**
 * Created by martin on 27/08/16.
 */
public interface Queue<T> {
    boolean isEmpty();
    int size();
    void add(T item); // agregar un item
    T top(); // retornar al primer item, lanzar exception si esta vacío.
    void remove(); // remover el primer item, lanzar exception si esta vacio
}
