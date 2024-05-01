package co.edu.uniquindio.parcial2fx.parcial2fxapp.Patrones.Command;

public class EntregaNacionalCommand implements ICommand {
    private Receptor receptor;
    private String ciudad;

    public EntregaNacionalCommand(Receptor receptor, String ciudad) {
        this.receptor = receptor;
        this.ciudad = ciudad;
    }

    @Override
    public void execute() {
        receptor.realizarEntregaNacional(ciudad);
    }
}
