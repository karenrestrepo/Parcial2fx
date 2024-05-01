package co.edu.uniquindio.parcial2fx.parcial2fxapp.Patrones.FactoyMethod.Inter.Impl;

import co.edu.uniquindio.parcial2fx.parcial2fxapp.Patrones.FactoyMethod.Inter.IProducto;

public class Motocicleta implements IProducto {
    private String nombre = "Motocicleta";
    private String detalleAlquiler = "Ideal para clientes que buscan un transporte ágil.";

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
