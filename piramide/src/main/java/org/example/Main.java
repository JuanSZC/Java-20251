package org.example;

import java.util.Scanner;


public class Main {
    static String piramide(int numero) {
        String piramide = "";
        for (int i = 0; i < numero; i++) {
            for (int j = 0; j <= i; j++) {
                piramide += "*";
            }
            piramide += "\n";
        }
        return piramide;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el numero de filas de la piramide: ");
        int numero = sc.nextInt();
        System.out.println(piramide(numero));
        }
    }
