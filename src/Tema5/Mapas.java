package Tema5;

import java.util.HashMap;
import java.util.Map;

public class Mapas {

    public static void main(String[] args) {
//        HashMap<String, String> perro = new HashMap<>(){{
//                put("dalmata","perro");
//        }};
        HashMap<String, String> perro = new HashMap<>();
        perro.put("Dalmata", "Esteban");
        perro.put("Dalmata2", "Esteban");
        perro.put("Dalmata3", "Esteban");
        perro.put("Dalmata4", "Esteban");
        perro.put("Dalmata5", "Esteban");
        System.out.println(perro);
        System.out.println(perro.get(1));
        perro.replace("Dalmata","Perro");
        System.out.println(perro);

        for (Map.Entry elemento:
                perro.entrySet()) {
            System.out.println("Elemento clave es: " + elemento.getKey() + " Elemento valor es: " + elemento.getValue());
        }
    }
}
