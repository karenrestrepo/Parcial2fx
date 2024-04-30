package co.edu.uniquindio.parcial2fx.parcial2fxapp.Patrones.FactoyMethod;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tipo de empleado (permanente o temporal): ");
        String tipo = scanner.nextLine();

        FabricaEmpleados fabrica = new FabricaEmpleados();
        Empleado empleado = fabrica.crearEmpleado(tipo);
        empleado.trabajar();
    }
}
