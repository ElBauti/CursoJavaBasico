package Tema3.ejercicio;

public class telefono extends SmartDevice{

    boolean cargarapida_lenta;

    public telefono(boolean cargarapida_lenta) {
    }

    public telefono(String color, String tamanyo, Float calidad_precio, Boolean encendido_apagado, boolean cargarapida_lenta) {
        this.color = color;
        this.tamanyo = tamanyo;
        this.calidad_precio = calidad_precio;
        this.encendido_apagado = encendido_apagado;
        this.cargarapida_lenta = cargarapida_lenta;
    }
    @Override
    public void prender_apagar() {
        {
            if (this.encendido_apagado == true){
                System.out.println("El telefono esta apagandose...");
                this.encendido_apagado = false;
                System.out.println("El telefono fue apagado");
            }
            else{
                System.out.println("El telefono esta prendiendose...");
                this.encendido_apagado = true;
                System.out.println("El telefono fue encendido");
            }
        }
    }
    @Override
    public String toString() {
        return "telefono{" +
                "cargarapida_lenta=" + cargarapida_lenta +
                ", color='" + color + '\'' +
                ", tamanyo='" + tamanyo + '\'' +
                ", calidad_precio=" + calidad_precio +
                ", encendido_apagado=" + encendido_apagado +
                '}';
    }
}

