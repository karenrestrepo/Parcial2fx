package co.edu.uniquindio.parcial2fx.parcial2fxapp.Prestamo;

import java.util.ArrayList;
import java.util.List;

public class PrestamoUq {
    private String nombre;
    List<Cliente> listaClientes = new ArrayList<>();
    List<Prestamo> listaPrestamos = new ArrayList<>();
    List<Empleado> listaEmpleados = new ArrayList<>();
    List<Objeto> listaObjetos = new ArrayList<>();

    /*Cosntructor*/

    public PrestamoUq() {
    }

    public PrestamoUq(String nombre, List<Cliente> listaClientes, List<Prestamo> listaPrestamos, List<Empleado> listaEmpleados, List<Objeto> listaObjetos) {
        this.nombre = nombre;
        this.listaClientes = listaClientes;
        this.listaPrestamos = listaPrestamos;
        this.listaEmpleados = listaEmpleados;
        this.listaObjetos = listaObjetos;
    }

    /*Getters and setters*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public List<Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }

    public void setListaPrestamos(List<Prestamo> listaPrestamos) {
        this.listaPrestamos = listaPrestamos;
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public List<Objeto> getListaObjetos() {
        return listaObjetos;
    }

    public void setListaObjetos(List<Objeto> listaObjetos) {
        this.listaObjetos = listaObjetos;
    }

    @Override
    public String toString() {
        return "PrestamoUq{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
