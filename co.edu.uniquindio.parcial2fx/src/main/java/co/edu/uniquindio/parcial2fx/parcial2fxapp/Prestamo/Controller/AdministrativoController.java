package co.edu.uniquindio.parcial2fx.parcial2fxapp.Prestamo.Controller;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.parcial2fx.parcial2fxapp.Prestamo.Factory.ModelFactory;
import co.edu.uniquindio.parcial2fx.parcial2fxapp.Prestamo.Model.PrestamoUq;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AdministrativoController {

    ModelFactory modelFactory;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnBuscarObjeto;

    @FXML
    private Button btnClientesMasPrestamos;

    @FXML
    private Button btnEstadoObjetos;

    @FXML
    private Button btnObjetosMasPrestados;

    @FXML
    private TextField txtCodigoObjeto;

    @FXML
    private TextField txtRangoClientesPrestamos;

    @FXML
    private TextField txtRangoObjetosPrestados;

    @FXML
    private TextArea txtRequerimientoBuscar;

    @FXML
    private TextArea txtRequerimientoClientes;

    @FXML
    private TextArea txtRequerimientoEstado;

    @FXML
    private TextArea txtRequerimientoObjetos;

    @FXML
    void onBuscarObjeto(ActionEvent event) {

    }

    @FXML
    void onClientesMasPrestamos(ActionEvent event) {

    }

    @FXML
    void onEstadoObjetos(ActionEvent event) {

    }

    @FXML
    void onObjetosMasPrestados(ActionEvent event) {
        String rango = txtRangoObjetosPrestados.getText().trim();
        if (!rango.isEmpty()) {
            try {
                String reporteObjetos = modelFactory.obtenerObjetosMasPrestados(rango);
                txtRequerimientoObjetos.setText(reporteObjetos);
            } catch (NumberFormatException e) {
                txtRequerimientoObjetos.setText("Por favor, ingrese un número válido.");
            }
        } else {
            txtRequerimientoObjetos.setText("Por favor, ingrese un número.");
        }
    }


    @FXML
    void initialize() {
        modelFactory = ModelFactory.getInstance();

    }

}

