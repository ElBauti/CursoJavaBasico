package Tema1;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>();
        nombres.add("nombre1");
        nombres.add("nombre2");
        nombres.add("nombre3");
        nombres.add("nombre4");


        for (String nombre:nombres) {
            System.out.println(nombre);
        }
    }
}
