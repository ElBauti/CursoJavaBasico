package Tema6;

import java.io.*;

public class BufferInputStreams {

    public static void main(String[] args) {
        try {
            InputStream fichero = new FileInputStream("C:\\Users\\Usuario\\Desktop\\pruebajava.txt");
            BufferedInputStream ficherobuffer = new BufferedInputStream(fichero);
            int datos = ficherobuffer.read();
            while (datos !=-1){
                System.out.println((char)datos);
                datos = ficherobuffer.read();
            }


        }catch (FileNotFoundException e){
            System.out.println("El programa da error: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
