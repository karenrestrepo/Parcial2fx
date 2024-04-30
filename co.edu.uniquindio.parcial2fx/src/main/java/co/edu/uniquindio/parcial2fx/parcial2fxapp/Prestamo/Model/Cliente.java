package co.edu.uniquindio.parcial2fx.parcial2fxapp.Prestamo.Model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona{

    List<Prestamo> listaPrestamosAsociados = new ArrayList<>();
    PrestamoUq ownedByPrestamoUq;

    /*Constructor*/

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String cedula, int edad, PrestamoUq ownedByPrestamoUq) {
        super(nombre, apellido, cedula, edad);
        this.ownedByPrestamoUq = ownedByPrestamoUq;
    }

    /*Getters and Setters*/

    public List<Prestamo> getListaPrestamosAsociados() {
        return listaPrestamosAsociados;
    }

    public void setListaPrestamosAsociados(List<Prestamo> listaPrestamosAsociados) {
        this.listaPrestamosAsociados = listaPrestamosAsociados;
    }

    public PrestamoUq getOwnedByPrestamoUq() {
        return ownedByPrestamoUq;
    }

    public void setOwnedByPrestamoUq(PrestamoUq ownedByPrestamoUq) {
        this.ownedByPrestamoUq = ownedByPrestamoUq;
    }

    @Override
    public String toString() {
        return "Cliente{} " + super.toString();
    }
}
