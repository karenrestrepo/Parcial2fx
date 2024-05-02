package co.edu.uniquindio.parcial2fx.parcial2fxapp.Patrones.Adapter_Parcial;

import java.util.Scanner;

public class AuthenticationAdapter implements LibraryAuthenticationInterface {
    private MultiFactorAuthenticationInterface modernAuthenticationSystem;

    public AuthenticationAdapter(MultiFactorAuthenticationInterface modernAuthenticationSystem) {
        this.modernAuthenticationSystem = modernAuthenticationSystem;
    }

    @Override
    public boolean authenticate(String username, String password) {
        // Lógica de adaptación de la autenticación antigua a la nueva
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Qué método de autenticación multifactor desea utilizar?");
        System.out.println("1. OTP (One-Time Password)");
        System.out.println("2. Biometría");
        System.out.println("3. Autenticación basada en dispositivo");
        System.out.print("Ingrese su elección (1-3): ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        switch (choice) {
            case 1:
                System.out.print("Ingrese el código OTP: ");
                String otp = scanner.nextLine();
                return modernAuthenticationSystem.authenticateWithOTP(username, password, otp);
            case 2:
                System.out.print("Ingrese los datos biométricos: ");
                String biometricData = scanner.nextLine();
                return modernAuthenticationSystem.authenticateWithBiometrics(username, password, biometricData);
            case 3:
                System.out.print("Ingrese el identificador de dispositivo: ");
                String deviceId = scanner.nextLine();
                return modernAuthenticationSystem.authenticateWithDevice(username, password, deviceId);
            default:
                System.out.println("Opción inválida. Se utilizará la autenticación básica.");
                return false;
        }
    }
}
