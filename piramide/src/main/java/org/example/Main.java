package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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
