package co.edu.uniquindio.parcial2fx.parcial2fxapp.Patrones.Adapter_Parcial;

public interface MultiFactorAuthenticationInterface {
    boolean authenticateWithOTP(String username, String password, String otp);
    boolean authenticateWithBiometrics(String username, String password, String biometricData);
    boolean authenticateWithDevice(String username, String password, String deviceId);
}
