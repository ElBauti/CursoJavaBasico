package Tema1.ClassCoche;

public  abstract class  Coche {

    //atributos
    String color;
    String frabricante;
    String model;
    double largo;
    double peso;

    int velocidad = 0;

    //constructor


    public Coche(){}

    public Coche(String color, String frabricante, String model, double largo, double peso, int velocidad) {
        this.color = color;
        this.frabricante = frabricante;
        this.model = model;
        this.largo = largo;
        this.peso = peso;
        this.velocidad = velocidad;
    }

    //comportamiento

    public void acelerar(int cantidad){
        int speed = this.velocidad+= cantidad;
        if (speed > 0 && speed <= 120){
            System.out.println("Aceleramos a: " + speed);
        }
        else {
            System.out.println("Estas yendo a la maxima velocidad detente o vas a chocar!!!");
        }
    }

    @Override
    public String toString() {
        return "Coche{" +
                "color='" + color + '\'' +
                ", frabricante='" + frabricante + '\'' +
                ", model='" + model + '\'' +
                ", largo=" + largo +
                ", peso=" + peso +
                ", velocidad=" + velocidad +
                '}';
    }
}
