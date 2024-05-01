package co.edu.uniquindio.parcial2fx.parcial2fxapp.Patrones.FactoyMethod.Inter.Impl;

import co.edu.uniquindio.parcial2fx.parcial2fxapp.Patrones.FactoyMethod.Inter.IProducto;

public class Coche implements IProducto {
    private String nombre = "Coche";
    private String detalleAlquiler = "Para uso personal o viajes de negocios.";

    @Override
    public void mostrarDetalles() {
        System.out.println("Producto: " + nombre + ", Detalle de alquiler: " + detalleAlquiler);
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getDetalleAlquiler() {
        return detalleAlquiler;
    }

}
