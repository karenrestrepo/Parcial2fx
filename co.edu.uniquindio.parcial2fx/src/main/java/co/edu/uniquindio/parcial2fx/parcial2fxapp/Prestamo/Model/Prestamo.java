package co.edu.uniquindio.parcial2fx.parcial2fxapp.Prestamo.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Prestamo {

    private String numeroPrestamo;
    private Date fechaPrestamo;
    private Date fechaEntrega;
    private String descripcion;
    Cliente clienteAsociado;
    Empleado empleadoAsociado;
    List<Objeto> listaObjetosAsociados = new ArrayList<>();
    PrestamoUq ownedByPrestamoUq;

    /*Constructor*/

    public Prestamo() {
    }

    public Prestamo(String numeroPrestamo, Date fechaPrestamo, Date fechaEntrega, String descripcion, PrestamoUq ownedByPrestamoUq) {
        this.numeroPrestamo = numeroPrestamo;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaEntrega = fechaEntrega;
        this.descripcion = descripcion;
        this.ownedByPrestamoUq = ownedByPrestamoUq;
    }

    /*Getters and setters*/

    public String getNumeroPrestamo() {
        return numeroPrestamo;
    }

    public void setNumeroPrestamo(String numeroPrestamo) {
        this.numeroPrestamo = numeroPrestamo;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Cliente getClienteAsociado() {
        return clienteAsociado;
    }

    public void setClienteAsociado(Cliente clienteAsociado) {
        this.clienteAsociado = clienteAsociado;
    }

    public Empleado getEmpleadoAsociado() {
        return empleadoAsociado;
    }

    public void setEmpleadoAsociado(Empleado empleadoAsociado) {
        this.empleadoAsociado = empleadoAsociado;
    }

    public List<Objeto> getListaObjetosAsociados() {
        return listaObjetosAsociados;
    }

    public void setListaObjetosAsociados(List<Objeto> listaObjetosAsociados) {
        this.listaObjetosAsociados = listaObjetosAsociados;
    }

    public PrestamoUq getOwnedByPrestamoUq() {
        return ownedByPrestamoUq;
    }

    public void setOwnedByPrestamoUq(PrestamoUq ownedByPrestamoUq) {
        this.ownedByPrestamoUq = ownedByPrestamoUq;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "numeroPrestamo='" + numeroPrestamo + '\'' +
                ", fechaPrestamo=" + fechaPrestamo +
                ", fechaEntrega=" + fechaEntrega +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
