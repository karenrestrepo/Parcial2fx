package co.edu.uniquindio.parcial2fx.parcial2fxapp.Patrones.FactoyMethod;

public class FabricaVehiculos implements IFabricaProductos {
    @Override
    public IProducto crearProducto(String tipo) {
        if (tipo.equalsIgnoreCase("coche")) {
            return new Coche();
        } else if (tipo.equalsIgnoreCase("motocicleta")) {
            return new Motocicleta();
        } else if (tipo.equalsIgnoreCase("bicicleta")) {
            return new Bicicleta();
        } else {
            throw new IllegalArgumentException("Tipo de vehículo no válido");
        }
    }
}
