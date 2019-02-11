package com.gmail.granovskiy.s;

public class LinkedList<T> implements List<T> {
    private int size = 0;
    private Node<T> first;
    private Node<T> last;

    @Override
    public void add(T t) {
        Node<T> lastNode = last;
        Node<T> newNode = new Node<>(lastNode, t, null);
        last = newNode;
        if (lastNode == null) {
            first = newNode;
        } else {
            lastNode.next = newNode;
        }
        size++;
    }

    private void checkIndex(int index) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    @Override
    public T get(int index) {
        checkIndex(index);
        Node<T> node = getNode(index);
        if(node != null) {
            return node.element;
        } else {
            return null;
        }
    }

    private Node<T> getNode(int index) {
        Node<T> node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    @Override
    public void remove(int index) {
        checkIndex(index);
        Node<T> node = getNode(index);
        Node<T> prev = node.prev;
        Node<T> next = node.next;
        if (prev == null) {
            first = node.next;
        } else {
            prev.next = next;
            node.prev = null;
        }
        if (next == null) {
            last = node.prev;
        } else {
            next.prev = prev;
            node.next = null;
        }
        node.element = null;
        size--;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node<T> node = first;
        for (int i = 0; i < size - 1; i++) {
            result.append(node).append(", ");
            node = node.next;
        }
        result.append(node.element).append("]");
        return result.toString();
    }

    private static class Node<T> {
        private T element;
        private Node<T> next;
        private Node<T> prev;

        public Node(Node<T> prev, T element, Node<T> next) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }

        public Node(T t, Object o) {
        }

        @Override
        public String toString() {
            return "" + element;
        }
    }
}
