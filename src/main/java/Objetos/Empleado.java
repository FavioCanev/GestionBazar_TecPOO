package Objetos;

import java.util.ArrayList;
import java.util.List;

public class Empleado extends Trabajador {
    private List<Producto> Ventas = new ArrayList<>();
    private Jefe jefe;

    public Empleado() {
    }

    public Empleado(boolean rol, String nombreTrabajador, String DNI, String telefono, double sueldo, List<Producto> ventas, Jefe jefe) {
        super(rol, nombreTrabajador, DNI, telefono, sueldo);
        Ventas = ventas;
        this.jefe = jefe;
    }

    public List<Producto> getVentas() {
        return Ventas;
    }

    public void setVentas(List<Producto> ventas) {
        Ventas = ventas;
    }

    public Jefe getJefe() {
        return jefe;
    }

    public void setJefe(Jefe jefe) {
        this.jefe = jefe;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "Ventas=" + getVentas() +
                ", jefe=" + getJefe() +
                ", ventas=" + getVentas() +
                ", rol=" + isRol() +
                ", nombreTrabajador='" + getNombreTrabajador() + '\'' +
                ", DNI='" + getDNI() + '\'' +
                ", telefono='" + getTelefono() + '\'' +
                ", sueldo=" + getSueldo() +
                '}';
    }
}
