package Tema3;

public class CocheFiat extends  Coche {

    String motor = "motor de audi v8";

    public CocheFiat() {
    }

    public CocheFiat(String fabricante, String modelo, String color, Double cc, int anyo, int velocidad) {
        super(fabricante, modelo, color, cc, anyo, velocidad);
        this.motor = "motor de audi";
    }

    public void acelerar(int cantidad){
        int rapidez = this.velocidad += cantidad;
        if (rapidez <= 90){
            System.out.println("estas yendo a: " + rapidez +" km/h");
        }
        else{
            System.out.println("Estas yendo demasiado rapido, te voy a bajar la velocidad asi no chocas!");
            System.out.println("Tu velocidad bajo de: " + rapidez + "km/h  a:  90km/h"  );
            this.velocidad = 120;
        }
    }

    @Override
    public String toString() {
        return "CocheFiat{" +
                "motor='" + motor + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cc=" + cc +
                ", anyo=" + anyo +
                ", velocidad=" + velocidad +
                '}';
    }
}
