package EjerciciosTemasADV;

import java.io.*;

public class Ejercicio6 {
    /*
    Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
    La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
     */

    public static void main(String[] args) throws IOException {
        InputStream fileIn = new FileInputStream("C:\\Users\\Usuario\\Desktop\\pruebajava.txt");
        PrintStream fileOut = new PrintStream("C:\\Users\\Usuario\\Desktop\\pruebajava2.txt");
        copyfile(fileIn, fileOut );
    }

    static void copyfile(InputStream fileIn, PrintStream fileOut ) throws IOException {
        byte[] datosin = fileIn.readAllBytes();
        for (byte dato :
                datosin) {
            fileOut.write(dato);
        }
        System.out.println("Datos copiados con exito");
    }
}
