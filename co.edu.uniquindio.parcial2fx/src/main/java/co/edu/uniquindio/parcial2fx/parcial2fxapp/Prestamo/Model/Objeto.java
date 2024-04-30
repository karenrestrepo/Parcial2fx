package co.edu.uniquindio.parcial2fx.parcial2fxapp.Prestamo.Model;

public class Objeto {

    private String nombre;
    private String codigoId;
    Prestamo prestamoAsociado;
    PrestamoUq ownedByPrestamoUq;

    /*Constructor*/

    public Objeto() {
    }

    public Objeto(String nombre, String codigoId, PrestamoUq ownedByPrestamoUq) {
        this.nombre = nombre;
        this.codigoId = codigoId;
        this.ownedByPrestamoUq = ownedByPrestamoUq;
    }

    public Objeto(String nombre, PrestamoUq ownedByPrestamoUq) {
        this.nombre = nombre;
        this.ownedByPrestamoUq = ownedByPrestamoUq;
    }

    /*Getters and setters*/

    public Prestamo getPrestamoAsociado() {
        return prestamoAsociado;
    }

    public void setPrestamoAsociado(Prestamo prestamoAsociado) {
        this.prestamoAsociado = prestamoAsociado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoId() {
        return codigoId;
    }

    public void setCodigoId(String codigoId) {
        this.codigoId = codigoId;
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
                ", codigoId='" + codigoId + '\'' +
                '}';
    }
}
