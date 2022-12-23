package Tema1;

public class Strings {
    public static void main(String[] args) {

        /*
        length()
        startsWith("")
        endsWith("")
        indexOF("")
        subString(1,5)
        trim()
        equals()
        compareTo
         */

        String mensaje, mensaje2;
        mensaje = "  Hola Mundo ";
        mensaje2 = "  Hola Mundo! ";

        System.out.println(mensaje.length());
        System.out.println(mensaje.startsWith("  Hola"));
        System.out.println(mensaje.endsWith(" "));
        System.out.println(mensaje.indexOf(1));
        System.out.println(mensaje.substring(1,6));
        System.out.println(mensaje.trim());
        System.out.println(mensaje.equals(mensaje2));
        System.out.println(mensaje.compareTo(mensaje2));

    }
}
