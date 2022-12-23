package Tema1;

import java.util.Scanner;

public class ScannerMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce un nombre");
        String nombre = scanner.nextLine();

        System.out.println("El nombre introducido es: " + nombre);
    }
}
