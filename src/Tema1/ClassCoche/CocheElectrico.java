package Tema1.ClassCoche;

public class CocheElectrico extends Coche{


    String motorElectrico;


    public CocheElectrico(String color, String frabricante, String model, double largo, double peso, int velocidad, String motorElectrico){
        super(color, frabricante, model, largo, peso, velocidad);
        this.motorElectrico = motorElectrico;
    }

    @Override
    public void acelerar(int cantidad) {
        System.out.println("vas muuuuy lento, compra un coche normal hombre!");
    }

    @Override
    public String toString() {
        return "CocheElectrico{" +
                "motorElectrico='" + motorElectrico + '\'' +
                ", color='" + color + '\'' +
                ", frabricante='" + frabricante + '\'' +
                ", model='" + model + '\'' +
                ", largo=" + largo +
                ", peso=" + peso +
                ", velocidad=" + velocidad +
                '}';
    }
}
