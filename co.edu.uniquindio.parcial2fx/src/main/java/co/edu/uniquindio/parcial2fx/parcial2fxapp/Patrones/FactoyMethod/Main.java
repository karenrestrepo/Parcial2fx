package co.edu.uniquindio.parcial2fx.parcial2fxapp.Patrones.FactoyMethod;
import co.edu.uniquindio.parcial2fx.parcial2fxapp.Patrones.FactoyMethod.Inter.IFabricaProductos;
import co.edu.uniquindio.parcial2fx.parcial2fxapp.Patrones.FactoyMethod.Inter.IProducto;

public class Main {
    public static void main(String[] args) {
        IFabricaProductos fabricaVehiculos = new FabricaVehiculos();
        IProducto coche = fabricaVehiculos.crearProducto("coche");
        coche.mostrarDetalles();

        IProducto bicicleta = fabricaVehiculos.crearProducto("bicicleta");
        bicicleta.mostrarDetalles();

        IProducto motocicleta = fabricaVehiculos.crearProducto("motocicleta");
        motocicleta.mostrarDetalles();

        IFabricaProductos fabricaElectrodomesticos = new FabricaElectrodomesticos();
        IProducto refrigerador = fabricaElectrodomesticos.crearProducto("refrigerador");
        refrigerador.mostrarDetalles();

        IProducto lavadora = fabricaElectrodomesticos.crearProducto("lavadora");
        lavadora.mostrarDetalles();

        IProducto televisor = fabricaElectrodomesticos.crearProducto("televisor");
        televisor.mostrarDetalles();
    }
}
