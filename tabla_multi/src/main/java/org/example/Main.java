package org.example;
import java.util.Scanner;

public class Main {
    static String tabla(int numero) {
        String tabla_multiplicar = "La tabla del numero " + numero + "\n";
        for (int i = 1; i <= 10; i++) {
            tabla_multiplicar += numero + " x " + i + " = " + numero * i + "\n";
        }
        return tabla_multiplicar;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el numero a multiplicar: ");
        int numero = sc.nextInt();
        System.out.println(tabla(numero));
    }
}