# 75.10 Técnicas de Diseño - TP0
 ![Build Status](https://travis-ci.org/MartinAndujarPeart/7510-TP0.svg?branch=master)


**Member**
--------------
Martin Andujar


**Primary Objective**
--------------
* Tener el proyecto compilando
(con Gradle) en IntelliJ.
* Los warnings de checkstyle se
tiene que resolver con el auto
formato del IDE.
* No warnings.
* Tener el proyecto compilando en
Travis (https://travis-ci.org/).


**Secondary Objective**
--------------

**Description**:

Implementar una Cola, tal que se cumpla la siguiente interfaz:

 **JAVA**:
 
      interface Queue<T>{
        boolean isEmpty();
        int size();
        void add(T item); // agregar un item
        T top(); // retornar al primer item, lanzar exception si esta vacío.
        void remove(); // remover el primer item, lanzar exception si esta vacio
      }

Y algunos tests unitarios que validen su uso

**Constraints**
--------------

* Ningún método es mayor a una línea
(incluido constructores). Una sola línea
significa un solo statement. Esto NO es
una sola línea:
    while(cond) { foo() ; cond = bar(); }.

* La cola debe estar implementada usando
una lista enlazada.
Restricciones


* Todas las condiciones de borde se
deben mantener (#remove y #top
deben lanzar AssertionError)


* La implementación no debe tener
ningún "conditional statement" (if,
 cases/switch, operadores ternarios).

* La implementación no debe usar
ninguna API/Lib provista. (Ej:
java.util.LinkedList, java.util.ArrayList,
etc)


**Requirements**
--------------

* Gradle
* Checkstyle
* Findbugs
* PMD
* JaCoCo

