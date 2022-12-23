package EjerciciosTemasADV;

import java.util.ArrayList;

public class Ejercicio1 {
    // Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
    public static void main(String[] args) {
        String[] nombres = new String[]{
                "Roman1",
                "Roman2",
                "Roman3"
        };

        for (String nombre:
             nombres) {
            System.out.println(nombre.toUpperCase());
        }
    }
}
