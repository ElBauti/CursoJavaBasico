package Tema3;

public class Main {


    public static void main(String[] args) {

          /* Por Defecto */
//        Coche coche1 = new Coche("ford","mustang","rojo",10.1,2020,100);
//        System.out.println(coche1.toString());
//        coche1.acelerar(200);
//        System.out.println(coche1.toString());


        /* Herencia */
        CocheFiat coche2 = new CocheFiat("ford","mustang","rojo",10.1,2020,100);
        System.out.println(coche2.toString());
        coche2.acelerar(200);
        System.out.println(coche2.toString());

        /* Polimorfismo */
        Coche coche1;
        coche1 = new CocheFiat();

        /* Clases Abstractas: no se pueden instanciar, solo instancian las clases hijas */
    }
}
