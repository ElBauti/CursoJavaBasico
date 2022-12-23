package Tema3.ejercicio;

public class MainMovil {
    public static void main(String[] args) {

        Reloj smart1 = new Reloj("reloj","largo", (float) 10.2,true,"grande","rojo");
        System.out.println(smart1.toString());
        smart1.prender_apagar();

        telefono smart2 = new telefono("rojo","grande",(float) 10.2,true,true);
        System.out.println(smart2.toString());
        smart2.prender_apagar();

    }
}