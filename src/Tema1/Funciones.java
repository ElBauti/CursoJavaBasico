package Tema1;

public class Funciones {

    public static void main(String[] args) {
     HolaMundo();
     HolaMundoconparametro("Bauti");
    }

    private static void HolaMundo() {
        System.out.println("Hola Mundo");
    }
    private static void HolaMundoconparametro(String name) {
        System.out.println("Hola " + name);
    }
}
