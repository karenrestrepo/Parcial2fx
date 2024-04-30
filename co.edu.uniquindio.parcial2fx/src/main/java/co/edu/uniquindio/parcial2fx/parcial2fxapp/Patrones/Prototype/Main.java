package co.edu.uniquindio.parcial2fx.parcial2fxapp.Patrones.Prototype;

public class Main {
    public static void main(String[] args) {
        Automovil auto1 = new Automovil("Toyota", "Corolla", 2020, 4);
        RegistroPrototipos.agregarPrototipo(auto1);

        Vehiculo autoClonado = RegistroPrototipos.getPrototipo(0);
        System.out.println("Auto clonado: " + autoClonado);
    }
}
