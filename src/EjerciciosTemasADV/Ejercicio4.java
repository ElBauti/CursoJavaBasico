package EjerciciosTemasADV;

import java.util.ArrayList;

public class Ejercicio4 {
    /*
    Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle
     recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves
     puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
     */

    public static void main(String[] args) {
        arraylistnum();
    }

    static void arraylistnum(){
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 11; i++) {
            numeros.add(i);
            if (numeros.size() == 11) {
                for (int j = 0; j < numeros.size(); j++) {
                    if (numeros.get(j) % 2 == 0) {
                        System.out.println("Eliminamos el numero: " + numeros.remove(j));
                    }}}}
        for (int numero:
                numeros) {
            System.out.println("El numero: " +numero + " es uno de los " + numeros.size() + " numeros que quedaron");
        }
    }

}
