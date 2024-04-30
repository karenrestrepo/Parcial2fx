package co.edu.uniquindio.parcial2fx.parcial2fxapp.Patrones.Prototype;

public class Automovil extends Vehiculo {
    private int numeroPuertas;

    public Automovil(String marca, String modelo, int año, int numeroPuertas) {
        super(marca, modelo, año);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public Vehiculo clonar() {
        return new Automovil(getMarca(), getModelo(), getAño(), numeroPuertas);
    }

    @Override
    public String toString() {
        return super.toString() + ", Número de puertas: " + numeroPuertas;
    }

    // Getters y setters
    public String getMarca() {
        return super.marca;
    }

    public String getModelo() {
        return super.modelo;
    }

    public int getAño() {
        return super.año;
    }
}

