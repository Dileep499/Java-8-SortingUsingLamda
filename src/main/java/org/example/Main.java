package org.example;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Book> books= new ArrayList<>();
        books.add(new Book("The Silent Patient", "Alex Michaelides", 325));
        books.add(new Book("Atomic Habits", "James Clear", 320));
        books.add(new Book("1984", "George Orwell", 328));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", 281));
        books.add(new Book("Pride and Prejudice", "James Clear", 279));
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 180));
        books.add(new Book("The Catcher in the Rye", "J.D. Salinger", 214));
        books.add(new Book("Becoming", "Michelle Obama", 448));
        books.add(new Book("Educated", "Tara Westover", 334));
        books.add(new Book("The Alchemist", "Paulo Coelho", 208));

        System.out.println("---------------- Sort by title---------");
        books.stream().sorted(Comparator.comparing((Book b)-> b.getTitle()))
                .forEach(s-> System.out.println(s.toString()));


        System.out.println("---------------- Sort by price---------");

        books.stream().sorted(Comparator.comparing((Book b)-> b.getPrice()))
                .forEach(s-> System.out.println(s.toString()));


        System.out.println("---------------- Sort by author in descending order and title in ascending  order---------");

        books.stream().sorted(Comparator.comparing((Book b)-> b.getAuthor(),Comparator.reverseOrder())
                .thenComparing((Book b)-> b.getTitle()))
                .forEach(s-> System.out.println(s.toString()));

        System.out.println("---------------- Sort by author and price in descending  order---------");

        books.stream().sorted(Comparator.comparing((Book b)-> b.getAuthor())
                        .thenComparing((Book b)-> b.getTitle()).reversed())
                .forEach(s-> System.out.println(s.toString()));

        System.out.println("---------------- Sort by price descending  order---------");

        books.stream().sorted((b1, b2)-> b1.getPrice()- b2.getPrice())
                .forEach(System.out::println);

        // nothing
        System.out.println("a");
    }
}