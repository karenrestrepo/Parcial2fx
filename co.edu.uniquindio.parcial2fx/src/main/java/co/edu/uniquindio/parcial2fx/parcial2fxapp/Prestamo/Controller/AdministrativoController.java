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
    private Button btnFechaEspecifica;

    @FXML
    private Button btnObjetosMasPrestados;

    @FXML
    private Button btnRangoFecha;

    @FXML
    private TextField txtCodigoObjeto;

    @FXML
    private TextField txtFechaEspecifica;

    @FXML
    private TextField txtRangoClientesPrestamos;

    @FXML
    private TextField txtRangoFechaFin;

    @FXML
    private TextField txtRangoFechaInicio;

    @FXML
    private TextField txtRangoObjetosPrestados;

    @FXML
    private TextArea txtRequerimientoBuscar;

    @FXML
    private TextArea txtRequerimientoClientes;

    @FXML
    private TextArea txtRequerimientoFecha;

    @FXML
    private TextArea txtRequerimientoObjetos;


    @FXML
    void onBuscarObjeto(ActionEvent event) {
        buscarObjeto();

    }

    private void buscarObjeto() {
        String codigoObjeto = txtCodigoObjeto.getText().trim();
        if (!codigoObjeto.isEmpty()) {
            try {
                String objetoEncontrado = modelFactory.buscarObjetoPorCodigo(codigoObjeto);
                if (objetoEncontrado != null) {
                    txtRequerimientoBuscar.setText(objetoEncontrado);
                } else {
                    txtRequerimientoBuscar.setText("No se encontró el objeto con el código: " + codigoObjeto);
                }
            } catch (Exception e) {
                txtRequerimientoBuscar.setText("Ocurrió un error al buscar el objeto.");
            }
        } else {
            txtRequerimientoBuscar.setText("Por favor, ingrese un código de objeto.");
        }
    }

    @FXML
    void onClientesMasPrestamos(ActionEvent event) {
        String rangoTexto = txtRangoClientesPrestamos.getText().trim();
        if (!rangoTexto.isEmpty()) {
            try {
                String reporteCliente = modelFactory.obtenerClientesMasPrestamos(rangoTexto);
                txtRequerimientoClientes.setText(reporteCliente);
            } catch (NumberFormatException e) {
                txtRequerimientoClientes.setText("Por favor, ingrese un número válido.");
            }
        } else {
            txtRequerimientoClientes.setText("Por favor, ingrese un número.");
        }

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
    void onFechaEspecifica(ActionEvent event) {
    }

    @FXML
    void onRangoFecha(ActionEvent event) {

    }

    @FXML
    void initialize() {
        modelFactory = ModelFactory.getInstance();
    }
}