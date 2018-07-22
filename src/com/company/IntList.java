package com.company;

public interface IntList<E> {

    void add(E e);
    E get(int index);
    int size();
    void clear();
    boolean isEmpty();
    void set(int index, E e);
    boolean contains(E e);
    void add(int index, E e);
    boolean remove(int index);
    boolean removeElement(E e);
    void checkIndex(int index);


}
