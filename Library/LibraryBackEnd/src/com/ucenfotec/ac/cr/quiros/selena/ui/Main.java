package com.ucenfotec.ac.cr.quiros.selena.ui;

import com.ucenfotec.ac.cr.quiros.selena.bl.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Library library;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Registrar libro");
            System.out.println("2. Registrar miembro");
            System.out.println("3. Listar libros");
            System.out.println("4. Listar miembros");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            try {

                String opcionStr = sc.nextLine();
                int opcion = Integer.parseInt(opcionStr);

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese el título del libro: ");
                        String titulo = String.valueOf(sc.nextInt());
                        System.out.print("Ingrese el autor del libro: ");
                        String autor = String.valueOf(sc.nextInt());
                        System.out.print("Ingrese el ISBN del libro: ");
                        String isbn = String.valueOf(sc.nextInt());
                        System.out.print("Ingrese el precio del libro: ");
                        double precio = Double.parseDouble(String.valueOf(sc.nextInt()));
                        System.out.print("Ingrese el número de páginas del libro: ");
                        int numeroPaginas = Integer.parseInt(String.valueOf(sc.nextInt()));

                        PhysicalBook libroFisico = new PhysicalBook(titulo, autor, isbn, precio, numeroPaginas);
                        Library.addMaterial(libroFisico);
                        System.out.println("Libro registrado exitosamente.");
                        System.out.println("----------------------");
                        break;

                    case 2:
                        System.out.print("Ingrese el nombre: ");
                        String memberName = String.valueOf(sc.nextInt());
                        System.out.print("Ingrese el correo electrónico: ");
                        String memberEmail = String.valueOf(sc.nextInt());
                        System.out.print("Ingrese la fecha de nacimiento: ");
                        System.out.print("Ingrese la dirección: ");
                        System.out.print("Establezca la contraseña: ");


                        Member member = new Member(memberName, memberEmail);
                        Library.addMember(member);
                        System.out.println("Miembro registrado exitosamente.");
                        System.out.println("----------------------");
                        break;

                    case 3:
                        Library.listInventory();
                        break;

                    case 4:
                        Library.listMembers();
                        break;

                    case 5:
                        System.out.println("¡Hasta luego!");
                        System.exit(0);

                    default:
                        System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                        System.out.println("----------------------");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("----------------------");
            }
        }
    }
}

