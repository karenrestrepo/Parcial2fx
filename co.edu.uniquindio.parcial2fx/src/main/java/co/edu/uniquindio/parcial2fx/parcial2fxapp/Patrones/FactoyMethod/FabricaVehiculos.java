package co.edu.uniquindio.parcial2fx.parcial2fxapp.Patrones.FactoyMethod;

import co.edu.uniquindio.parcial2fx.parcial2fxapp.Patrones.FactoyMethod.Inter.IFabricaProductos;
import co.edu.uniquindio.parcial2fx.parcial2fxapp.Patrones.FactoyMethod.Inter.IProducto;
import co.edu.uniquindio.parcial2fx.parcial2fxapp.Patrones.FactoyMethod.Inter.Impl.Bicicleta;
import co.edu.uniquindio.parcial2fx.parcial2fxapp.Patrones.FactoyMethod.Inter.Impl.Coche;
import co.edu.uniquindio.parcial2fx.parcial2fxapp.Patrones.FactoyMethod.Inter.Impl.Motocicleta;

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
