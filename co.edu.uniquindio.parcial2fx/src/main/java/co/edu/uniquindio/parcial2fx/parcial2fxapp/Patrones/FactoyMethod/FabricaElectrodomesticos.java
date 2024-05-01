package co.edu.uniquindio.parcial2fx.parcial2fxapp.Patrones.FactoyMethod;

public class FabricaElectrodomesticos implements IFabricaProductos {
    @Override
    public IProducto crearProducto(String tipo) {
        if (tipo.equalsIgnoreCase("refrigerador")) {
            return new Refrigerador();
        } else if (tipo.equalsIgnoreCase("televisor")) {
            return new Televisor();
        } else if (tipo.equalsIgnoreCase("lavadora")) {
            return new Lavadora();
        } else {
            throw new IllegalArgumentException("Tipo de electrodoméstico no válido");
        }
    }
}
