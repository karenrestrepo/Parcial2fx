package co.edu.uniquindio.parcial2fx.parcial2fxapp.Patrones.Observer;

public class EstacionCentral implements IObservador {
    @Override
    public void actualizar(double temperatura, double humedad, double presion) {
        System.out.println("Estación Central: Temperatura=" + temperatura + ", Humedad=" + humedad + ", Presión=" + presion);
    }
}
