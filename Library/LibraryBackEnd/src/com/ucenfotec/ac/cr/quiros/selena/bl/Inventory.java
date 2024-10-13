package com.ucenfotec.ac.cr.quiros.selena.bl;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private ArrayList books;
    private ArrayList quantity;

    public Inventory() {
    }

    public Inventory(ArrayList books, ArrayList quantity) {
        this.books = books;
        this.quantity = quantity;
    }

    public ArrayList getBooks() {
        return books;
    }

    public ArrayList addBooks(Inventory books) {
        this.books.add(books);
        return null;
    }
    public void addBook(Book book) {
    }

    public void removeBooks(Inventory books) {
        this.books.remove(books);
    }

    public ArrayList getQuantity() {
        return quantity;
    }

    public void setQuantity(ArrayList quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "books=" + books +
                ", quantity=" + quantity +
                '}';
    }
}
