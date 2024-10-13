package com.ucenfotec.ac.cr.quiros.selena.ui;

import com.ucenfotec.ac.cr.quiros.selena.bl.Role;

import java.util.Scanner;

public class InputReader {
    private Scanner scanner;

    public InputReader() {
        scanner = new Scanner(System.in);
    }

    public String readString(String prompt) {
        System.out.print(prompt + ": ");
        return scanner.nextLine();
    }

    public Role readRole(String prompt) {
        System.out.print(prompt + " (STUDENT/TEACHER/VISITOR/ADMIN): ");
        String input = scanner.nextLine().toUpperCase();
        return Role.valueOf(input);
    }

    public void close() {
        scanner.close();
    }
}
