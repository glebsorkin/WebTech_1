package com.company.ClassesAndObjects.Task12;

import java.util.Comparator;
import java.util.Objects;

public class Book implements Cloneable, Comparable<Book> {

    private String title;
    private String author;
    private int price;
    private static int edition;
    private int isbn;

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPrice() {
        return this.price;
    }

    public int getIsbn() {
        return this.isbn;
    }

    @Override
    public boolean equals(Object b) {
        if (this == b) {
            return true;
        }
        if (b == null || b.getClass() != this.getClass()) {
            return false;
        }
        Book book = (Book) b;
        return Objects.equals(book.title, this.title)
                && Objects.equals(book.author, this.author)
                && book.price == this.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.title, this.author, this.price);
    }

    @Override
    public String toString() {
        return "Book specifications: title-\"" + this.title
                + "\", author-" + this.author
                + ", price-" + this.price + ".";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int compareTo(Book book) {
        return this.getIsbn() - book.getIsbn();
    }

    public static Comparator<Book> TitleComparator = new Comparator<Book>() {
        @Override
        public int compare(Book book1, Book book2) {
            return book1.getTitle().compareTo(book2.getTitle());
        }
    };

    public static Comparator<Book> TitleAuthorComparator = new Comparator<Book>() {
        @Override
        public int compare(Book book1, Book book2) {
            if (book1.getTitle().compareTo(book2.getTitle()) == 0) {
                return book1.getAuthor().compareTo(book2.getAuthor());
            }
            return book1.getTitle().compareTo(book2.getTitle());
        }
    };

    public static Comparator<Book> AuthorTitleComparator = new Comparator<Book>() {
        @Override
        public int compare(Book book1, Book book2) {
            if (book1.getAuthor().compareTo(book2.getAuthor()) == 0) {
                return book1.getTitle().compareTo(book2.getTitle());
            }
            return book1.getAuthor().compareTo(book2.getAuthor());
        }
    };

    public static Comparator<Book> AuthorTitlePriceComparator = new Comparator<Book>() {
        @Override
        public int compare(Book book1, Book book2) {
            if (book1.getAuthor().compareTo(book2.getAuthor()) == 0) {
                if (book1.getTitle().compareTo(book2.getTitle()) == 0) {
                    return book1.getPrice() - book2.getPrice();
                }
                return book1.getTitle().compareTo(book2.getTitle());
            }
            return book1.getAuthor().compareTo(book2.getAuthor());
        }
    };
}
