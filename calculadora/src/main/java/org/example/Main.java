package org.example;

import java.util.Scanner;

public class Main {
    static int sumar(int valor1, int valor2) {
        return valor1 + valor2;
    }
    static int restar(int valor1, int valor2) {
        return valor1 - valor2;
    }
    static int multiplicar(int valor1, int valor2) {
        return valor1 * valor2;
    }
    static double dividir(double valor1, double valor2) {
        if (valor2 != 0) {
            return valor1 / valor2;
        }
        else {
            System.out.println("No se puede dividir por 0");
            System.exit(0);
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Selecciona el tipo de operacion\n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\nTu seleccion: ");
        String opcion = sc.next();
        System.out.print("Ingresa el primer valor: ");
        int valor1 = sc.nextInt();
        System.out.print("Ingresa el segundo valor: ");
        int valor2 = sc.nextInt();
        switch (opcion) {
            case "1":
                System.out.println("La suma de " + valor1 + " y " + valor2 + " es " + sumar(valor1, valor2));
                break;
            case "2":
                System.out.println("La resta de " + valor1 + " y " + valor2 + " es " + restar(valor1, valor2));
                break;
            case "3":
                System.out.println("La multiplicacion de " + valor1 + " y " + valor2 + " es " + multiplicar(valor1, valor2));
                break;
            case "4":
                System.out.println("La division de " + valor1 + " y " + valor2 + " es " + dividir(valor1, valor2));
                break;

        }
    }
}