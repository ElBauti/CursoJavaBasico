package Tema3.ejercicio;

public class Reloj extends  SmartDevice{

    String tamanyocremallera, colorcremallera;


    public Reloj() {
    }

    public Reloj(String color, String tamanyo, Float calidad_precio, Boolean encendido_apagado, String tamanyocremallera, String colorcremallera) {
        this.color = color;
        this.tamanyo = tamanyo;
        this.calidad_precio = calidad_precio;
        this.encendido_apagado = encendido_apagado;
        this.colorcremallera = colorcremallera;
        this.tamanyocremallera = tamanyocremallera;

    }

    @Override
    public String toString() {
        return "Reloj{" +
                "tamanyocremallera='" + tamanyocremallera + '\'' +
                ", colorcremallera='" + colorcremallera + '\'' +
                ", color='" + color + '\'' +
                ", tamanyo='" + tamanyo + '\'' +
                ", calidad_precio=" + calidad_precio +
                ", encendido_apagado=" + encendido_apagado +
                '}';
    }

    @Override
    public void prender_apagar() {
//        super.prender_apagar();
        if (this.encendido_apagado == true){
            System.out.println("El reloj esta apagandose...");
            this.encendido_apagado = false;
            System.out.println("El reloj fue apagado");
        }
        else{
            System.out.println("El reloj esta prendiendose...");
            this.encendido_apagado = true;
            System.out.println("El reloj fue encendido");
        }
    }

}
