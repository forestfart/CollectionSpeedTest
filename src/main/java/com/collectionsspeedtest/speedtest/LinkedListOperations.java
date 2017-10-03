package com.collectionsspeedtest.speedtest;

import java.util.*;

public class LinkedListOperations {
    public void run() {

        //create new big array
        LinkedList<Book> list = new LinkedList<Book>();
        for(int n = 0; n < 2000000; n++) {
            Book element = new Book("Unknown#" + n, "anonymous");
            list.add(element);
        }
        //time measurement setup
        long begin = System.currentTimeMillis();
        long end = System.currentTimeMillis();
        begin = System.currentTimeMillis();

        //Removing fist elelment of LinkedList array
        System.out.println("Part 1: LinkedList operations \nLinkedList array with number of elements " + list.size() + " has been created for the porpouse of this excercise");
        Book element = list.peekFirst();
        System.out.println("\n Operation 1: Removing first elelment of this array: " + element.getTitle());

        list.remove(element);

        System.out.println("Number of elements: " + list.size());
        end = System.currentTimeMillis();
        System.out.println("Elapsed time: " + (end - begin) + "ms");

        //Removing last elelment of LinkedList array
        begin = System.currentTimeMillis();
        element = list.peekLast();
        System.out.println("\n Operation 2: Removing last elelment of this array: " + element.getTitle());

        list.remove(element);

        System.out.println("Number of elements: " + list.size());
        end = System.currentTimeMillis();
        System.out.println("Elapsed time: " + (end - begin) + "ms");

        //Adding fist elelment of LinkedList array
        System.out.println("Number of elements in LinkedList array: " + list.size());
        element = new Book("First New Book", "annonymous");
        System.out.println("\n Operation 3: Adding first elelment of this array: " + element.getTitle());

        list.addFirst(element);

        System.out.println("Number of elements: " + list.size());
        end = System.currentTimeMillis();
        System.out.println("Elapsed time: " + (end - begin) + "ms");

        //Removing last elelment of LinkedList array
        begin = System.currentTimeMillis();
        element = new Book("Last New Book", "annonymous");
        System.out.println("\n Operation 4: Adding last elelment of this array: " + element.getTitle());

        list.addLast(element);

        System.out.println("Number of elements: " + list.size());
        end = System.currentTimeMillis();
        System.out.println("Elapsed time: " + (end - begin) + "ms");
        System.out.println("------------------- end of part 1 ---------------------\n");
    }
}
