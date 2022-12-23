package Tema4;

import Tema4.Interface.Empleadocrudimpl;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoCRUD {

    List<Empleado> empleados = new ArrayList<Empleado>();

    public void Guardar(Empleado empleado){
        empleados.add(empleado);
        System.out.println("Se agrego el empleado: " + empleado.nombre);
    }


    public void Eliminar(Empleado empleado) {
        for (Empleado i : empleados) {
            if (i.nombre == empleado.nombre && i.activo == empleado.activo && i.salario == empleado.salario && i.edad == empleado.edad) {
                empleados.remove(empleado);
                System.out.println("Se removio el empleado llamado: " + empleado.nombre);
            }
        }
    }
    public void VerEmpleados(){
        System.out.println(empleados);
    }
}

