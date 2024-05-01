package co.edu.uniquindio.parcial2fx.parcial2fxapp.Patrones.Command;

public class Invocador {
    public void ejecutarComando(ICommand comando) {
        comando.execute();
    }
}
