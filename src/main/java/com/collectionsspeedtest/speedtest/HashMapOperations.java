package com.collectionsspeedtest.speedtest;

import java.util.*;

public class HashMapOperations {
    public void run() {
        //create big hash map with one unique item for search
        HashMap<Book, Chapters> hashMap = new HashMap<Book, Chapters>();
        for(int n = 0; n < 2000000; n++) {
            Chapters chapter = new Chapters("Chapter1", "Chapter2", " Chapter3");
            if(n != 1999999) {
                Book book = new Book("Unknown", "anonymous");
                hashMap.put(book, chapter);
            } else {
                Book book = new Book("Mysterious Island", "Verne");
                hashMap.put(book, chapter);
            }
        }
        //welcome message
        System.out.println("Part 2: HashMap operations \nHashMap array with number of elements " + hashMap.size() + " has been created for the porpouse of this excercise");

        //time measurement setup
        long begin = System.currentTimeMillis();
        long end = System.currentTimeMillis();
        begin = System.currentTimeMillis();
        //searching for the element by key value
        Book book1 = new Book("Mysterious Island", "anonymous");
        for(Map.Entry<Book, Chapters> element : hashMap.entrySet()) {
            if(book1.equals(element.getKey())) {
                System.out.println("\n Operation 1: Searching element of this array by key value: " + element.getKey() + " - successfuly completed");
            }
        }
        end = System.currentTimeMillis();
        System.out.println("Number of elements: " + hashMap.size());
        System.out.println("Elapsed time: " + (end - begin) + "ms");

        //adding one more elelement to the HashMap array
        begin = System.currentTimeMillis();
        Chapters chapter = new Chapters("Chapter1", "Chapter2", " Chapter3");
        Book book = new Book("Green Island", "Unknown");
        hashMap.put(book, chapter);
        System.out.println("\n Operation 2: Adding one more elelement: " + book.title + " - successfuly completed");
        end = System.currentTimeMillis();
        System.out.println("Number of elements: " + hashMap.size());
        System.out.println("Elapsed time: " + (end - begin) + "ms");

        //removing one elelement from the HashMap array
        begin = System.currentTimeMillis();
        hashMap.remove(book);
        System.out.println("\n Operation 2: Removing one elelement: " + book.title + " - successfuly completed");
        end = System.currentTimeMillis();
        System.out.println("Number of elements: " + hashMap.size());
        System.out.println("Elapsed time: " + (end - begin) + "ms");
        System.out.println("------------------- end of part 2 ---------------------\n");
    }
}

