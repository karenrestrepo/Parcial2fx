package co.edu.uniquindio.parcial2fx.parcial2fxapp.Patrones.Adapter_Parcial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instanciar el sistema de autenticación antiguo y el adaptador
        LegacyLibrarySystem legacyLibrarySystem = new LegacyLibrarySystem();
        ModernAuthenticationSystem modernAuthenticationSystem = new ModernAuthenticationSystem();
        AuthenticationAdapter adapter = new AuthenticationAdapter(modernAuthenticationSystem);

        // Solicitar credenciales al usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre de usuario: ");
        String username = scanner.nextLine();
        System.out.print("Ingrese la contraseña: ");
        String password = scanner.nextLine();

        // Autenticar utilizando el adaptador
        boolean isAuthenticated = adapter.authenticate(username, password);

        if (isAuthenticated) {
            System.out.println("Autenticación exitosa.");
        } else {
            System.out.println("Autenticación fallida.");
        }
    }
}