package co.edu.uniquindio.parcial2fx.parcial2fxapp.Patrones.Adapter;

public class AdaptadorPasarelaPagos extends SistemaPagoHeredado implements IPasarelaPagos {
    @Override
    public boolean realizarPago(double monto) {
        procesarPago(monto);
        return true;
    }
}
