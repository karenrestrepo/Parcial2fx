package co.edu.uniquindio.parcial2fx.parcial2fxapp.Patrones.Observer;

public class DispositivoMovil implements IObservador {
    @Override
    public void actualizar(double temperatura, double humedad, double presion) {
        System.out.println("Dispositivo Móvil: Temperatura=" + temperatura + ", Humedad=" + humedad + ", Presión=" + presion);
    }
}
