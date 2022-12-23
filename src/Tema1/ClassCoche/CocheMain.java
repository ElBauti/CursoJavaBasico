package Tema1.ClassCoche;

public class CocheMain {

    public static void main(String[] args) {

//        Coche coche1 = new Coche("rojo","alfa romeo","m4",200,2000.2, 10);
//        coche1.acelerar(20);
//        System.out.println(coche1.toString());

        CocheElectrico cocheE = new CocheElectrico("rojo","alfa romeo","m4",200,2000.2, 10,"1000EWR");
        System.out.println(cocheE.toString());
        cocheE.acelerar(20);

        //Polimorfismo
        Coche polimorfismo = new CocheElectrico("rojo","alfa romeo","m4",200,2000.2, 10,"1000EWR");
    }
}
