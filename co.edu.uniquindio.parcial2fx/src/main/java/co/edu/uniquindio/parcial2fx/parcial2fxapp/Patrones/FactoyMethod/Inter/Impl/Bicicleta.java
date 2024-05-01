package co.edu.uniquindio.parcial2fx.parcial2fxapp.Patrones.FactoyMethod.Inter.Impl;

import co.edu.uniquindio.parcial2fx.parcial2fxapp.Patrones.FactoyMethod.Inter.IProducto;

public class Bicicleta implements IProducto {
    private String nombre = "Bicicleta";
    private String detalleAlquiler = "Para clientes eco-conscientes o eventos en zonas urbanas.";

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
