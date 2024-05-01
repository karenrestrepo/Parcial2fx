package co.edu.uniquindio.parcial2fx.parcial2fxapp.Patrones.Observer;

import java.util.ArrayList;
import java.util.List;

public class EstacionMeteorologica {
    private double temperatura;
    private double humedad;
    private double presion;
    private List<IObservador> observadores;

    public EstacionMeteorologica() {
        observadores = new ArrayList<>();
    }

    public void agregarObservador(IObservador observador) {
        observadores.add(observador);
    }

    public void eliminarObservador(IObservador observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores() {
        for (IObservador observador : observadores) {
            observador.actualizar(temperatura, humedad, presion);
        }
    }

    // 5. Actualizaciones del Clima
    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
        notificarObservadores();
    }

    public void setHumedad(double humedad) {
        this.humedad = humedad;
        notificarObservadores();
    }

    public void setPresion(double presion) {
        this.presion = presion;
        notificarObservadores();
    }

}
