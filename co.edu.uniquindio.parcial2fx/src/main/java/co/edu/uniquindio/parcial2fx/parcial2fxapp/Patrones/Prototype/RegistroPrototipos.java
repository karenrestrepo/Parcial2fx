package co.edu.uniquindio.parcial2fx.parcial2fxapp.Patrones.Prototype;

public class RegistroPrototipos {
    private static Vehiculo[] prototipos = new Vehiculo[10];
    private static int indice = 0;

    public static Vehiculo getPrototipo(int index) {
        return prototipos[index].clonar();
    }

    public static void agregarPrototipo(Vehiculo prototipo) {
        prototipos[indice++] = prototipo;
    }
}
