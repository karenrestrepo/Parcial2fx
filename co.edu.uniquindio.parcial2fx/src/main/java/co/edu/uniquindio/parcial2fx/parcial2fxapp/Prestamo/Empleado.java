package co.edu.uniquindio.parcial2fx.parcial2fxapp.Prestamo;

public class Empleado extends  Persona{

    PrestamoUq ownedByPrestamoUq;

    /*Constructor*/
    public Empleado() {
    }

    public Empleado(String nombre, String apellido, String cedula, int edad, PrestamoUq ownedByPrestamoUq) {
        super(nombre, apellido, cedula, edad);
        this.ownedByPrestamoUq = ownedByPrestamoUq;
    }

    /*Getters and setters*/

    public PrestamoUq getOwnedByPrestamoUq() {
        return ownedByPrestamoUq;
    }

    public void setOwnedByPrestamoUq(PrestamoUq ownedByPrestamoUq) {
        this.ownedByPrestamoUq = ownedByPrestamoUq;
    }

    @Override
    public String toString() {
        return "Empleado{} " + super.toString();
    }
}
