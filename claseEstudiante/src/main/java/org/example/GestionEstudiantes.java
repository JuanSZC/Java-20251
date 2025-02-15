package org.example;

import java.util.Scanner;

public class GestionEstudiantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese ID del estudiante: ");
        String id = scanner.nextLine();

        System.out.print("Ingrese nombres: ");
        String nombres = scanner.nextLine();

        System.out.print("Ingrese apellidos: ");
        String apellidos = scanner.nextLine();

        System.out.print("Ingrese correo: ");
        String correo = scanner.nextLine();

        System.out.print("Ingrese teléfono: ");
        String telefono = scanner.nextLine();

        System.out.print("Ingrese edad: ");
        int edad = scanner.nextInt();


        Estudiante estudiante = new Estudiante(id, nombres, apellidos, correo, telefono, edad);


        System.out.println("\nInformación del estudiante:");
        estudiante.mostrarInformacion();

        scanner.close();
    }
}
