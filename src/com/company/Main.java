package com.company;


public class Main {
    public static void main(String[] args) {

        IntList list = new IntArrayList();
        list.add(5);
        list.add(3);
        list.add(7);
        list.add(2);


        System.out.println("List: " + list);
        list.remove(3);
        System.out.println("List: " + list);


    }

}
