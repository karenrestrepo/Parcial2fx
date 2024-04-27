package co.edu.uniquindio.parcial2fx.parcial2fxapp.Prestamo;

public class Objeto {

    private String nombre;
    PrestamoUq ownedByPrestamoUq;

    /*Constructor*/

    public Objeto() {
    }

    public Objeto(String nombre, PrestamoUq ownedByPrestamoUq) {
        this.nombre = nombre;
        this.ownedByPrestamoUq = ownedByPrestamoUq;
    }

    /*Getters and setters*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public PrestamoUq getOwnedByPrestamoUq() {
        return ownedByPrestamoUq;
    }

    public void setOwnedByPrestamoUq(PrestamoUq ownedByPrestamoUq) {
        this.ownedByPrestamoUq = ownedByPrestamoUq;
    }

    @Override
    public String toString() {
        return "Objeto{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
