package com.collectionsspeedtest.speedtest;

public class Book {
    String title;
    String author;

    //constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public boolean equals(Book chckObject) {
        return this.title == chckObject.title; // tutaj trzeba bylo uzyc equals(); :-/
    }

    public String toString() {
        return title;
    }

    //getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
