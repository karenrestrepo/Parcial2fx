module co.edu.uniquindio.parcial2fx.parcial2fxapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens co.edu.uniquindio.parcial2fx.parcial2fxapp to javafx.fxml;
    opens co.edu.uniquindio.parcial2fx.parcial2fxapp.Prestamo.Controller;
    exports co.edu.uniquindio.parcial2fx.parcial2fxapp;
    exports co.edu.uniquindio.parcial2fx.parcial2fxapp.Prestamo.Controller;
}