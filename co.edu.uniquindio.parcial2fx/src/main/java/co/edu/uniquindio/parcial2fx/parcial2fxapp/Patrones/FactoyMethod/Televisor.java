package co.edu.uniquindio.parcial2fx.parcial2fxapp.Patrones.FactoyMethod;

public class Televisor implements IProducto {
    private String nombre = "Televisor";
    private double precioAlquiler = 15.0;

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
