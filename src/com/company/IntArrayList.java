package com.company;

public class IntArrayList<E> implements IntList<E> {

    private Object[] array;
    private int size;

    public IntArrayList() {
        int DEFAULT_SIZE = 10;
        array = new Object[DEFAULT_SIZE];
    }

    @Override
    public void add(E e) {
        if (size >= array.length) {
            resize();
        }
        array[size] = e;
        size++;
    }

    private void resize() {
        int newSize = array.length * 3 / 2 + 1;
        Object[] newArr = new Object[newSize];
        System.arraycopy(array, 0, newArr, 0, array.length);
        array = newArr;

    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException();
        }
        return (E) array[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        size = 0;

    }

    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }


    }

    @Override
    public void checkIndex(int index) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException();
        }
    }


    @Override
    public void set(int index, E e) {
        checkIndex(index);
        array[index] = e;
    }

    @Override
    public boolean contains(E e) {
        for ( int i = 0; i < size; i++ ) {
            if (e.equals(array[i])) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void add(int index, E e) {
        checkIndex(index);
        if (size >= array.length) {
            resize();
        }
        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = e;
        size++;
    }


    @Override
    public boolean remove(int index) {
        checkIndex(index);
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        size--;
        return true;

    }

    @Override
    public boolean removeElement(E e) {
        for ( int i = 0; i < size; i++ ) {
            if (e.equals(array[i])) {
                System.arraycopy(array, i + 1, array, i, size - i - 1);
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for ( int i = 0; i < size; i++ ) {
            sb.append(" Element ").append(i).append(" = ").append(array[i]);
        }
        sb.append("]");
        return sb.toString();
    }


}

