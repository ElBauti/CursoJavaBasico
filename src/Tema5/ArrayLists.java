package Tema5;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayLists {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Elemento A");
        lista.add("Elemento B");
        lista.add("Elemento C");
        lista.add("Elemento D");
        lista.add("Elemento E");

        System.out.println(lista);
        lista.remove("Elemento C");
        System.out.println(lista);


        LinkedList<String> linkedList = new LinkedList<>();
    }
}
