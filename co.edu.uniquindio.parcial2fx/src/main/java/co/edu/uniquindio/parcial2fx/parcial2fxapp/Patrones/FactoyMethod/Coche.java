package co.edu.uniquindio.parcial2fx.parcial2fxapp.Patrones.FactoyMethod;

public class Coche implements IProducto {
    private String nombre = "Coche";
    private double precioAlquiler = 50.0;

    @Override
    public void mostrarDetalles() {
        System.out.println("Producto: " + nombre + ", Precio de alquiler: $" + precioAlquiler);
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double getPrecioAlquiler() {
        return precioAlquiler;
    }

}
