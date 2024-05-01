package co.edu.uniquindio.parcial2fx.parcial2fxapp.Patrones.Adapter;

public class Main {
    public static void main(String[] args) {
            IPasarelaPagos pasarelaPagos = new AdaptadorPasarelaPagos();
            boolean pagoExitoso = pasarelaPagos.realizarPago(100.0);
            System.out.println("Pago exitoso: " + pagoExitoso);
        }

}
