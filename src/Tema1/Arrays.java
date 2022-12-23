package Tema1;

public class Arrays {
    public static void main(String[] args) {

            String nomb1,nomb2,nomb3;
            nomb1 = "a1";
            nomb2 = "a2";
            nomb3 = "a3";

            String[] nombres = new String[3];
            nombres[0] = nomb1;
            nombres[1] = nomb2;
            nombres[2] = nomb3;

            String[] nombressinlimite = new String[]{nomb1,nomb2,nomb3};

            for (String nombre:nombres) {
                System.out.println(nombre);
            }




    }
}
