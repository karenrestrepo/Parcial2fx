package co.edu.uniquindio.parcial2fx.parcial2fxapp.Patrones.Adapter_Parcial;

public class ModernAuthenticationSystem implements MultiFactorAuthenticationInterface {
    @Override
    public boolean authenticateWithOTP(String username, String password, String otp) {
        // Lógica de autenticación con OTP
        System.out.println("Autenticando con OTP en el sistema de autenticación moderno...");
        if (otp.equals("123456")) {
            System.out.println("Autenticación exitosa con OTP en el sistema de autenticación moderno.");
            return true;
        } else {
            System.out.println("Autenticación fallida con OTP en el sistema de autenticación moderno.");
            return false;
        }
    }

    @Override
    public boolean authenticateWithBiometrics(String username, String password, String biometricData) {
        // Lógica de autenticación con biometría
        System.out.println("Autenticando con biometría en el sistema de autenticación moderno...");
        System.out.println("Autenticación exitosa con biometría en el sistema de autenticación moderno.");
        return true;
    }

    @Override
    public boolean authenticateWithDevice(String username, String password, String deviceId) {
        // Lógica de autenticación con dispositivo
        System.out.println("Autenticando con dispositivo en el sistema de autenticación moderno...");
        System.out.println("Autenticación exitosa con dispositivo en el sistema de autenticación moderno.");
        return true;
    }
}
