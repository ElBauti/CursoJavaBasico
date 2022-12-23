package Tema4.Interface;

import Tema4.Empleado;

public class Main {

    static  EmpleadoCRUD empleadocrud = new Empleadocrudimpl();

    public static void main(String[] args) {

        Empleado robert = new Empleado("juan",20,true,2000);
        Empleado robert1 = new Empleado("juan1",20,true,2000);


        empleadocrud.save(robert);
        empleadocrud.save(robert1);
        empleadocrud.delete(robert);
        System.out.println(empleadocrud.findAll());

    }
}
