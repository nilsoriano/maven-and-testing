package org.example;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

//sala 4
public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("aa",14);
        Book b2 = new Book("How to GIT gud",12351);
        Book b3 = new Book("AAAAAAAAAAAAAA", 231);

        List<Book> pubBooks = new ArrayList<Book>(){}; // try without add
        pubBooks.add(b1);
        pubBooks.add(b2);
        pubBooks.add(b3);

        Author a1 = new Author("AAAAA","ZZZZ", pubBooks);

        Gson g1 = new Gson();
        System.out.println(g1.toJson(a1));
    }
}