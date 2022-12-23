package EjerciciosTemasADV;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ejercicio3 {
    //Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.
    public static void main(String[] args) {
        ArrayList<String> elementos = new ArrayList<>();
        elementos.add("Juan1");
        elementos.add("Juan2");
        elementos.add("Juan3");
        elementos.add("Juan4");

        LinkedList<String> elementoslinked = new LinkedList<>();

        for (int i = 0; i < elementos.size() ; i++) {
            System.out.println(elementos.get(i) + " de el arraylist");
            elementoslinked.add(elementos.get(i));
            System.out.println(elementoslinked.get(i) + " de la linkedlist");
        }
    }
}
