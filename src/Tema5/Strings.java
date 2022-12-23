package Tema5;

public class Strings {



    public static void main(String[] args) {

        String cadena = "Mensaje de texto";
        int cadenalen = cadena.length();
        System.out.println("La longitud de mi cadena es de: " + cadenalen);

        String cademin = cadena.toLowerCase();
        System.out.println("La cadena ahora es: " + cademin);

        String cademayus = cadena.toUpperCase();
        System.out.println("La cadena ahora es: " + cademayus);

        boolean resultado = cadena.startsWith("Men");
        System.out.println(resultado);

        resultado = cadena.endsWith("ta");
        System.out.println(resultado);

        for (int i = 0; i < cadenalen ; i++) {
            System.out.println(cadena.charAt(i));
        }
    }
}
