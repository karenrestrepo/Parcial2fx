package co.edu.uniquindio.parcial2fx.parcial2fxapp.Patrones.Command;

public class EntregaLocalCommand implements ICommand {
    private Receptor receptor;
    private String direccion;

    public EntregaLocalCommand(Receptor receptor, String direccion) {
        this.receptor = receptor;
        this.direccion = direccion;
    }

    @Override
    public void execute() {
        receptor.realizarEntregaLocal(direccion);
    }

}
