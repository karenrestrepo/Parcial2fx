module co.edu.uniquindio.parcial2fx.parcial2fxapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens co.edu.uniquindio.parcial2fx.parcial2fxapp to javafx.fxml;
    exports co.edu.uniquindio.parcial2fx.parcial2fxapp;
}