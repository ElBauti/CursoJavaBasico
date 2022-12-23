package Tema2;

public class Funciones {

    static void showMenu(){
        System.out.println("Bienvenidos al ecommerce de zapatillas");
        System.out.println("1 - Ver zapatillas");
        System.out.println("2 - Comprar zapatillas");
        System.out.println("3 - Salir");
    }

    static String getMenu(){
        return "Bienvenidos al eccomerce de zapatillas \n 1-ver zapatillas....";
    }

    static void imprimirsaludosconparametros(String name){
        System.out.println("Buenos Dias " + name +" !");
    }

    static String imprimirsaludosconparametros(String name, String surname){
        return "Buenos dias" + name + surname  +" !" ;
    }



    public static void main(String[] args) {
        // opcion 1: funcion sin parametros y sin tipo de retorno
            showMenu();
        //opcion 2: funcion sin parametros y con tipo de retorno
            System.out.println(getMenu());

        //opcion 3: funcion con parametros y sin de retorno
            imprimirsaludosconparametros("juan");

        //opcion 4: funcion con parametros y con tipo de retorno
        System.out.println(imprimirsaludosconparametros("juan", "paco"));
    }





}
