package co.edu.uniquindio.parcial2fx.parcial2fxapp.Patrones.Adapter2;

public class LegacyLibrarySystem implements LibraryAuthenticationInterface {
    @Override
    public boolean authenticate(String username, String password) {
        // Lógica de autenticación antigua (ejemplo: usuario y contraseña hardcodeados)
        System.out.println("Autenticando en el sistema de biblioteca antiguo...");
        if (username.equals("admin") && password.equals("password")) {
            System.out.println("Autenticación exitosa en el sistema de biblioteca antiguo.");
            return true;
        } else {
            System.out.println("Autenticación fallida en el sistema de biblioteca antiguo.");
            return false;
        }
    }
}