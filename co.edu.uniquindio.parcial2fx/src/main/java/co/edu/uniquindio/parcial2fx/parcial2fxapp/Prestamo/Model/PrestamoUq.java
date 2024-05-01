package co.edu.uniquindio.parcial2fx.parcial2fxapp.Prestamo.Model;

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


    public String obtenerEmpleadosMasPrestamos(String rango) {
        int rangoReseltado = Integer.parseInt(rango);
        StringBuilder resultado = new StringBuilder();
        for (Empleado empleado : listaEmpleados) {
            int cantidadPrestamos = 0;
            for (Prestamo prestamo : listaPrestamos) {
                if (prestamo.getEmpleadoAsociado().equals(empleado)) {
                    cantidadPrestamos++;
                }
            }
            if (cantidadPrestamos >= rangoReseltado) {
                resultado.append(empleado.toString()).append(" - Cantidad de préstamos: ").append(cantidadPrestamos).append("\n");
            }
        }
        return resultado.toString();
    }

    public String buscarClientePorCedula(String cedula) {
        String clienteEncontrado = "";
        for (Cliente cliente : listaClientes) {
            if (cliente.getCedula().equalsIgnoreCase(cedula)) {
                clienteEncontrado += cliente;
                return clienteEncontrado.toString();
            }

        }
        return null;
    }

    public String obtenerObjetosMenosPrestados(String rango) {
        StringBuilder reporte = new StringBuilder();
        int rangoEntero = Integer.parseInt(rango);
        for (Objeto objeto : listaObjetos) {
            int contador = 0;
            for (Prestamo prestamo : listaPrestamos) {
                for (Objeto objetoPrestado : prestamo.getListaObjetosAsociados()) {
                    if (objeto.getNombre().equalsIgnoreCase(objetoPrestado.getNombre())) {
                        contador++;
                    }
                }
            }
            if (contador <= rangoEntero) {
                reporte.append(objeto.toString()).append("\n");
            }
        }
        return reporte.toString();
    }

    @Override
    public String toString() {
        return "PrestamoUq{" +
                "nombre='" + nombre + '\'' +
                '}';
    }


    public String obtenerEstadoObjetos() {
        StringBuilder resultado = new StringBuilder();
        List<Objeto> objetosDisponibles = new ArrayList<>();
        List<Objeto> objetosNoDisponibles = new ArrayList<>();

        for (Objeto objeto : listaObjetos) {
            boolean estaAsociado = false;
            for (Prestamo prestamo : listaPrestamos) {
                if (prestamo.getListaObjetosAsociados().contains(objeto)) {
                    estaAsociado = true;
                    break;
                }
            }
            if (estaAsociado) {
                objetosNoDisponibles.add(objeto);
            } else {
                objetosDisponibles.add(objeto);
            }
        }

        resultado.append("Objetos disponibles:\n");
        for (Objeto objeto : objetosDisponibles) {
            resultado.append(objeto.toString()).append("\n");
        }
        resultado.append("\nObjetos no disponibles:\n");
        for (Objeto objeto : objetosNoDisponibles) {
            resultado.append(objeto.toString()).append("\n");
        }

        return resultado.toString();
    }
}
