package co.edu.uniquindio.parcial2fx.parcial2fxapp.Patrones.FactoyMethod;

public class FabricaEmpleados {
    public Empleado crearEmpleado(String tipo) {
        if (tipo.equalsIgnoreCase("permanente")) {
            return new EmpleadoPermanente();
        } else if (tipo.equalsIgnoreCase("temporal")) {
            return new EmpleadoTemporal();
        } else {
            throw new IllegalArgumentException("Tipo de empleado no válido.");
        }
    }

}
