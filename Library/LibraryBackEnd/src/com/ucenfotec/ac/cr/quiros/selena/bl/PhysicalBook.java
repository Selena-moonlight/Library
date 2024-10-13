package com.ucenfotec.ac.cr.quiros.selena.bl;

public class PhysicalBook extends Book{
    private int numeroPaginas;

    public PhysicalBook(String title, String author,BookGender bookGender, String isbn, double price, Category category) {
        super(title, author, bookGender, isbn, price, category);
    }

    public PhysicalBook(String titulo, String autor, String isbn, double precio, int numeroPaginas) {
        super(titulo, autor, isbn, precio, numeroPaginas);
        this.numeroPaginas = numeroPaginas;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de páginas: " + numeroPaginas);
    }
}
