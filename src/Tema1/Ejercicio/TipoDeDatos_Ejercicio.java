package Tema1.Ejercicio;


import java.util.HashMap;
import java.util.Map;

public class TipoDeDatos_Ejercicio {
    public static void tipodedatos() {
        Map<String, String> tipodedatos = new HashMap<>();
        //enteros
        tipodedatos.put("byte","1");
        tipodedatos.put("short","2");
        tipodedatos.put("int","3");
        tipodedatos.put("long","4");
        //puntos flotantes
        tipodedatos.put("float","2.9f");
        tipodedatos.put("double","3.1d");
        //caracter
        tipodedatos.put("char","A");
        //boolean
        tipodedatos.put("boolean","true");
        tipodedatos.put("boolean","false");
        //strings
        tipodedatos.put("String","hola soy una cadena de texto");


        System.out.println(tipodedatos.entrySet());
    }
    public static void main(String[] args) {
        tipodedatos();
    }
}