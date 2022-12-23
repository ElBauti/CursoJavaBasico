package Tema2.ejercicio;

import java.util.Scanner;



public class FuncionEjercicio {

    static String getTotalPrice() {
        Float teclado = new Scanner(System.in).nextFloat();
        System.out.println("Ingrese el precio del producto");
        float precio_producto = teclado;
        System.out.println("Ingrese el iva");
        float producto_mas_iva = precio_producto *  (1+ teclado / 100);
        return "El precio total a pagar es de: " + producto_mas_iva;
    }

    public static void main(String[] args) {
        System.out.println(getTotalPrice());
    }
}
