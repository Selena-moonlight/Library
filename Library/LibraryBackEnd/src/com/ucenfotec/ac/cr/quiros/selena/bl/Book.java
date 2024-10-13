package com.ucenfotec.ac.cr.quiros.selena.bl;


public class Book implements Material {
    private String title;
    private String author;
    private BookGender bookGender;
    private String isbn;
    private double price;
    private Category category;

    public Book(String title, String author, BookGender bookGender, String isbn, double price, Category category) {
    }

    public Book(String title, BookGender bookGender,String isbn , String author, double price, Category category) {
        this.title = title;
        this.author = author;
        this.bookGender = bookGender;
        this.isbn = isbn;
        this.price = price;
        this.category = category;
    }

    public Book(String titulo, String autor, String isbn, double precio, int numeroPaginas) {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public BookGender getBookGender() {
        return bookGender;
    }

    public void setBookGender(BookGender bookGender) {
        this.bookGender = bookGender;
    }

    public String getIsbn() {
        return isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }


    @Override
    public void mostrarInformacion() {
        System.out.println( title + '\'' +
                ", author='" + author + '\'' +
                ", bookGender=" + bookGender +
                ", isbn='" + isbn + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}');
    }
}
