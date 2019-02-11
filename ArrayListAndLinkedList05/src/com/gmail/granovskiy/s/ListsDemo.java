package com.gmail.granovskiy.s;

public class ListsDemo {
    public static void main(String[] args) {
        //  ArrayList operations
        List<Integer> list = new ArrayList<>();
        System.out.println("Initial ArrayList size = " + list.size());
        //  method: T get(int i);
        list.add(7);
        list.add(57);
        list.add(35);
        list.add(89);
        list.add(1);
        list.add(9);
        list.add(19);
        System.out.println("ArrayList after adding 7 elements (original size): " + list);
        list.add(17);
        list.add(21);
        list.add(25);
        System.out.println("ArrayList after adding 3 more elements (resized):  " + list);
        //  method: void add(T t);
        System.out.println("5-th element: " + list.get(5) + "; " + " 8-th element: " + list.get(8) + ".");
        //  method int size();
        System.out.println("ArrayList size: " + list.size());
        //  method void remove(int i);
        list.remove(5);
        System.out.println("ArrayList after removing 5-th element: " + list);
        //  method int size();
        System.out.println("ArrayList size after removing 5-th element = " + list.size());
        System.out.println();

        //  LinkedList operations
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(15);
        linkedList.add(34);
        linkedList.add(57);
        linkedList.add(11);
        linkedList.add(35);
        linkedList.add(79);
        linkedList.add(99);
        System.out.println("Initial LinkedList: " + linkedList);
        System.out.println("Size= " + linkedList.size());
        System.out.println("Get fifth element = " + linkedList.get(5));
        linkedList.remove(5);
        System.out.println("After removing the 5-th element");
        System.out.println("LinkedList = " + linkedList);
        System.out.println("Size = " + linkedList.size());
    }
}
