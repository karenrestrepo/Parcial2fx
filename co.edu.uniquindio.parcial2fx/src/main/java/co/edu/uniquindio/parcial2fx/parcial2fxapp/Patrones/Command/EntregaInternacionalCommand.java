package co.edu.uniquindio.parcial2fx.parcial2fxapp.Patrones.Command;

public class EntregaInternacionalCommand implements ICommand {
    private Receptor receptor;
    private String pais;

    public EntregaInternacionalCommand(Receptor receptor, String pais) {
        this.receptor = receptor;
        this.pais = pais;
    }

    @Override
    public void execute() {
        receptor.realizarEntregaInternacional(pais);
    }
}
