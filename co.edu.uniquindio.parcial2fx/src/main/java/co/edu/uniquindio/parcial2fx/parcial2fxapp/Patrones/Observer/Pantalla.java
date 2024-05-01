package co.edu.uniquindio.parcial2fx.parcial2fxapp.Patrones.Observer;

public class Pantalla implements IObservador {
    @Override
    public void actualizar(double temperatura, double humedad, double presion) {
        System.out.println("Pantalla: Temperatura=" + temperatura + ", Humedad=" + humedad + ", Presión=" + presion);
    }
}
