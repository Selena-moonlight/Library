package com.ucenfotec.ac.cr.quiros.selena.bl;

import java.time.LocalDate;
import java.util.Arrays;

public class Reservation {
    private int reservationNumber;
    private String memberName;
    private Status status;
    private LocalDate reservationDate;
    private Book[] book;

    public Reservation() {
    }

    public Reservation(int reservationNumber, String memberName, Status status, LocalDate reservationDate, Book[] book) {
        this.reservationNumber = reservationNumber;
        this.memberName = memberName;
        this.status = status;
        this.reservationDate = reservationDate;
        this.book = book;
    }

    public int getReservationNumber() {
        return reservationNumber;
    }

    public String getMemberName() {
        return memberName;
    }

    public Status getStatus() {
        return status;
    }

    public void updateStatus(Status status) {
        this.status = status;
    }

    public LocalDate getReservationDate() {
        return reservationDate;
    }

    public void updateReservationDate(LocalDate reservationDate) {
        this.reservationDate = reservationDate;
    }

    public Book[] getBook() {
        return book;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationNumber=" + reservationNumber +
                ", memberName='" + memberName + '\'' +
                ", status=" + status +
                ", reservationDate=" + reservationDate +
                ", book=" + Arrays.toString(book) +
                '}';
    }
}
