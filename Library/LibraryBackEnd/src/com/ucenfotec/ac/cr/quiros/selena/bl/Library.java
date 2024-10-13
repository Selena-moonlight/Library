package com.ucenfotec.ac.cr.quiros.selena.bl;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private Inventory inventory;
    private List<Member> members;

    public Library() {
        this.inventory = new Inventory();
        this.members = new ArrayList<>();
    }

    public static void addMaterial(PhysicalBook libroFisico) {
    }

    public static void listInventory() {

    }

    public static void listMembers() {

    }

    public void addBook(Book book) {
        inventory.addBook(book);
    }

    public static void addMember(Member member) {member.add(member);
    }

    public List<Book> getBooks() {
        return inventory.getBooks();
    }

    public List<Member> getMembers() {
        return members;
    }

}
