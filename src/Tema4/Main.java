package Tema4;

public class Main {
    public static void main(String[] args) {

        EmpleadoCRUD empleadoCRUD = new EmpleadoCRUD();
        Empleado empleado1 = new Empleado("juan",20,true,2000);
        Empleado empleado2 = new Empleado("juan2",20,true,2000);
        Empleado empleado3 = new Empleado("juan3",20,true,2000);
            empleadoCRUD.Guardar(empleado1);
            empleadoCRUD.Guardar(empleado2);
            empleadoCRUD.Guardar(empleado3);
            empleadoCRUD.VerEmpleados();
    }
}
