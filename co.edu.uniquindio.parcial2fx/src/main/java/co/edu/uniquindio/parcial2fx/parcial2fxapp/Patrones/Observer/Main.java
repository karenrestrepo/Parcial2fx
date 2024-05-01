package co.edu.uniquindio.parcial2fx.parcial2fxapp.Patrones.Observer;

public class Main {
    public static void main(String[] args) {
        EstacionMeteorologica estacion = new EstacionMeteorologica();

        // Crear observadores
        IObservador pantalla = new Pantalla();
        IObservador dispositivoMovil = new DispositivoMovil();
        IObservador estacionCentral = new EstacionCentral();

        // Registrar observadores
        estacion.agregarObservador(pantalla);
        estacion.agregarObservador(dispositivoMovil);
        estacion.agregarObservador(estacionCentral);

        // Actualizar condiciones climáticas
        estacion.setTemperatura(25.0);
        estacion.setHumedad(0.6);
        estacion.setPresion(1020.0);

        // Eliminar un observador
        estacion.eliminarObservador(dispositivoMovil);

        // Actualizar condiciones climáticas nuevamente
        estacion.setTemperatura(28.0);
        estacion.setHumedad(0.7);
        estacion.setPresion(1018.0);

    }
}
