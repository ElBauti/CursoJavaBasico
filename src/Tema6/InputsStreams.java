package Tema6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputsStreams {

    public static void main(String[] args){
        try {
            InputStream fichero = new FileInputStream("C:\\Users\\Usuario\\Desktop\\pruebajava.txt");
            int datos = fichero.read();
            while (datos !=-1){
                System.out.println((char)datos);
                datos = fichero.read();
            }


        }catch (FileNotFoundException e){
            System.out.println("El programa da error: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

        //ASI SE LEE TODO EL FICHERO

        //            byte[] datos = fichero.readAllBytes();
        //
        //            for (byte dato:
        //                 datos) {
        //                System.out.println((char)dato);
        //            }
}
