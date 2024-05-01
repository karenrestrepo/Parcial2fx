package co.edu.uniquindio.parcial2fx.parcial2fxapp.Patrones.FactoyMethod.Inter.Impl;

import co.edu.uniquindio.parcial2fx.parcial2fxapp.Patrones.FactoyMethod.Inter.IProducto;

public class Lavadora implements IProducto {
    private String nombre = "Lavadora";
    private String detalleAlquiler = "Principalmente para clientes en rentas de vivienda a largo plazo.\n";

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
