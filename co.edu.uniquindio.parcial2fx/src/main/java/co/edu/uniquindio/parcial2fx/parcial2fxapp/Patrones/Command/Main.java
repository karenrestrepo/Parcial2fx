package co.edu.uniquindio.parcial2fx.parcial2fxapp.Patrones.Command;

public class Main {
    public static void main(String[] args) {
        Receptor receptor = new Receptor();
        Invocador invocador = new Invocador();


        ICommand entregaLocal = new EntregaLocalCommand(receptor, "Calle Principal 123");
        ICommand entregaNacional = new EntregaNacionalCommand(receptor, "Ciudad Capital");
        ICommand entregaInternacional = new EntregaInternacionalCommand(receptor, "País Vecino");


        invocador.ejecutarComando(entregaLocal);
        invocador.ejecutarComando(entregaNacional);
        invocador.ejecutarComando(entregaInternacional);
    }
}
