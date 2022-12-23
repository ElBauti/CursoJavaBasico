package Tema4;

public class Empleado {

    public String nombre;
    public int edad;
    public boolean activo;
    public double salario;

    public  Empleado(){
    }

    public Empleado(String nombre, int edad, boolean activo, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.activo = activo;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", activo=" + activo +
                ", salario=" + salario +
                '}';
    }
}
