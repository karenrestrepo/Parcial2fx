package co.edu.uniquindio.parcial2fx.parcial2fxapp.Patrones.Command;

public class Receptor {
    public void realizarEntregaLocal(String direccion) {
        System.out.println("Realizando entrega local a: " + direccion);
    }

    public void realizarEntregaNacional(String ciudad) {
        System.out.println("Realizando entrega nacional a: " + ciudad);
    }

    public void realizarEntregaInternacional(String pais) {
        System.out.println("Realizando entrega internacional a: " + pais);
    }
}
