package Tema4.Interface;
import Tema4.Empleado;
import java.util.ArrayList;
import java.util.List;

public class Empleadocrudimpl implements  EmpleadoCRUD {

    List<Empleado> empleados = new ArrayList<Empleado>();

    @Override
    public void save(Empleado empleado){
        empleados.add(empleado);
        System.out.println("Se agrego el empleado: " + empleado.nombre);
    }

    @Override
    public List<Empleado> findAll() {
        return empleados;
    }

    @Override
    public void delete(Empleado empleado) {
        for (Empleado i : empleados) {
            if (i.nombre == empleado.nombre && i.activo == empleado.activo && i.salario == empleado.salario && i.edad == empleado.edad) {
                empleados.remove(empleado);
                System.out.println("Se removio el empleado llamado: " + empleado.nombre);
            }
        }
    }
}
