package EjerciciosTemasADV.ejercicio7;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class Curriculum {

    String nombre;
    String apellido;
    Integer edad;
    ArrayList<String> experiencias;
    ArrayList<String> aptitudes;

    public Curriculum() {
        this.nombre = "";
        this.apellido = "";
        this.edad = 0;
        this.experiencias = new ArrayList<>() {
        };
        this.aptitudes = new ArrayList<>();

    }


    public void fakedata() {
        this.nombre = "pedro";
        this.apellido = "sanchez";
        this.edad = 110;
        this.experiencias = new ArrayList<>(Arrays.asList("Vendedor de churros", "Mantelero", "Guarda coches"));
        this.aptitudes = new ArrayList<>(Arrays.asList("proactivo", "trabajo en equipo", "En aprendizaje continuo"));
    }


    @Override
    public String toString() {
        return "Curriculum{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", experiencias=" + experiencias +
                ", aptitudes=" + aptitudes +
                '}';
    }


    public void ficheros() {
        try {
            File file = new File("C:\\Users\\Usuario\\Desktop\\Java1\\src\\EjerciciosTemasADV\\ejercicio7\\pruebajava.txt");
            FileWriter filew = new FileWriter(file);
            filew.write(this.toString());
            filew.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
