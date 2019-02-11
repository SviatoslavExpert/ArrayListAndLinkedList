package com.gmail.granovskiy.s;

import java.util.Arrays;

public class ArrayList<T> implements List<T> {
    private int arrayLength = 7;
    private Object[] arrayOne;
    private int size = 0;

    public ArrayList() {
        arrayOne = new Object[arrayLength];
    }

    @Override
    public void add(T t) {
        if (size == arrayOne.length) {
            resize(arrayOne.length + 1);
            arrayOne[size++] = t;
        } else {
            arrayOne[size++] = t;
        }
    }

    private void resize(int newArrayLength) {
        arrayOne = Arrays.copyOf(arrayOne, newArrayLength);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T get(int i) {
        checkI(i);
        return (T) arrayOne[i];
    }

    private void checkI(int i) {
        if (i < 0 || i > size) {
            throw new ArrayIndexOutOfBoundsException("Index: " + i + ", Size: " + size);
        }
    }

    @Override
    public void remove(int i) {
        checkI(i);
        int newSize = size - i - 1;
        System.arraycopy(arrayOne, i + 1, arrayOne, i, newSize);
        arrayOne[--size] = null;
    }

    @Override
    public String toString() {
        T[] temp = (T[]) new Object[size];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = (T) arrayOne[i];
        }
        return Arrays.toString(temp);
    }
}
