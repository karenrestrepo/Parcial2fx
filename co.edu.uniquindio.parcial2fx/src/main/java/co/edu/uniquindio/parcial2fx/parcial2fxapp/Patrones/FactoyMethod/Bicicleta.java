package co.edu.uniquindio.parcial2fx.parcial2fxapp.Patrones.FactoyMethod;

public class Bicicleta implements IProducto {
    private String nombre = "Bicicleta";
    private double precioAlquiler = 10.0;

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
