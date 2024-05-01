package co.edu.uniquindio.parcial2fx.parcial2fxapp.Patrones.FactoyMethod;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IFabricaProductos fabricaVehiculos = new FabricaVehiculos();
        IProducto coche = fabricaVehiculos.crearProducto("coche");
        coche.mostrarDetalles();

        IProducto motocicleta = fabricaVehiculos.crearProducto("motocicleta");
        motocicleta.mostrarDetalles();

        IFabricaProductos fabricaElectrodomesticos = new FabricaElectrodomesticos();
        IProducto refrigerador = fabricaElectrodomesticos.crearProducto("refrigerador");
        refrigerador.mostrarDetalles();

        IProducto televisor = fabricaElectrodomesticos.crearProducto("televisor");
        televisor.mostrarDetalles();
    }
}
