package com.gmail.granovskiy.s;

import java.util.Arrays;

public class ArrayList<T> implements List<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] data;
    private int size = 0;

    public ArrayList() {
        data = new Object[DEFAULT_CAPACITY];
    }

    @Override
    public void add(T t) {
        if (size == data.length) {
            data = Arrays.copyOf(data, data.length * 2);
            data[size++] = t;
        } else {
            data[size++] = t;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T get(int index) {
        checkIndex(index);
        return (T) data[index];
    }

    private void checkIndex(int index) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    @Override
    public void remove(int index) {
        checkIndex(index);
        int newSize = size - index - 1;
        System.arraycopy(data, index + 1, data, index, newSize);
        data[--size] = null;
    }

    @Override
    public String toString() {
        T[] temp = (T[]) new Object[size];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = (T) data[i];
        }
        return Arrays.toString(temp);
    }
}
