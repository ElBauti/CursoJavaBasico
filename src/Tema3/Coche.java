package Tema3;

public abstract class  Coche {


    //Atributos
    String fabricante, modelo, color;
    Double cc;
    int anyo,velocidad;


    //Constructores

    public Coche() {
    }

    public Coche(String fabricante, String modelo, String color, Double cc, int anyo, int velocidad) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.cc = cc;
        this.anyo = anyo;
        this.velocidad = velocidad;
    }

    //metodos (comportamientos)

    public void acelerar(int cantidad){
        int rapidez = this.velocidad += cantidad;
        if (rapidez <= 120){
            System.out.println("estas yendo a: " + rapidez +" km/h");
        }
        else{
            System.out.println("Estas yendo demasiado rapido, te voy a bajar la velocidad asi no chocas!");
            System.out.println("Tu velocidad bajo de: " + rapidez + "km/h  a:  120km/h"  );
            this.velocidad = 120;
        }
    }


    @Override
    public String toString() {
        return "Coche{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cc=" + cc +
                ", anyo=" + anyo +
                ", velocidad=" + velocidad +
                '}';
    }
}
