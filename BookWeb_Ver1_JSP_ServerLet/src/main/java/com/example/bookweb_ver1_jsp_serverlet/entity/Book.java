package com.example.bookweb_ver1_jsp_serverlet.entity;

public class Book {
    private int id;
    private String title;
    private String author;
    private Float price;


    public Book(int id, String title, String author, Float price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }
}
