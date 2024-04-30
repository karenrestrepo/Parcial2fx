package co.edu.uniquindio.parcial2fx.parcial2fxapp.Patrones.Prototype;

public class Vehiculo implements Cloneable {
    String marca;
    String modelo;
    int año;

    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public Vehiculo clonar() {
        try {
            return (Vehiculo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Error al clonar el vehículo", e);
        }
    }

    @Override
    public String toString() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Año: " + año;
    }
}