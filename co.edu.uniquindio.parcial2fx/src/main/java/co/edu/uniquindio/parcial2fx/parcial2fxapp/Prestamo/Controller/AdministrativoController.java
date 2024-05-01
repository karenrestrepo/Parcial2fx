package co.edu.uniquindio.parcial2fx.parcial2fxapp.Prestamo.Controller;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.parcial2fx.parcial2fxapp.Prestamo.Factory.ModelFactory;
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
    private Button btnBuscarCliente;

    @FXML
    private Button btnEmpleadosMasPrestamos;

    @FXML
    private Button btnEstadoObjetos;

    @FXML
    private Button btnObjetosMenosPrestados;

    @FXML
    private TextField txtCedulaCliente;

    @FXML
    private TextField txtRangoEmpleadosPrestamos;

    @FXML
    private TextField txtRangoObjetosPrestados;

    @FXML
    private TextArea txtRequerimientoBuscar;

    @FXML
    private TextArea txtRequerimientoEmpleados;

    @FXML
    private TextArea txtRequerimientoEstado;

    @FXML
    private TextArea txtRequerimientoObjetos;

    @FXML
    void onBuscarCliente(ActionEvent event) {
        buscarCliente();

    }

    private void buscarCliente() {
        String cedulaCliente = txtCedulaCliente.getText().trim();
        if (!cedulaCliente.isEmpty()) {
            try {
                String clienteEncontrado = modelFactory.buscarClientePorCedula(cedulaCliente);
                if (clienteEncontrado != null) {
                    txtRequerimientoBuscar.setText(clienteEncontrado);
                } else {
                    txtRequerimientoBuscar.setText("No se encontró el cliente con la cedula: " + cedulaCliente);
                }
            } catch (Exception e) {
                txtRequerimientoBuscar.setText("Ocurrió un error al buscar el cliente.");
            }
        } else {
            txtRequerimientoBuscar.setText("Por favor, ingrese una cedula de un cliente.");
        }
    }

    @FXML
    void  onEmpleadosMasPrestamos(ActionEvent event) {
        String rangoTexto = txtRangoEmpleadosPrestamos.getText().trim();
        if (!rangoTexto.isEmpty()) {
            try {
                String reporteEmpleado = modelFactory.obtenerEmpleadosMasPrestamos(rangoTexto);
                txtRequerimientoEmpleados.setText(reporteEmpleado);
            } catch (NumberFormatException e) {
                txtRequerimientoEmpleados.setText("Por favor, ingrese un número válido.");
            }
        } else {
            txtRequerimientoEmpleados.setText("Por favor, ingrese un número.");
        }

    }

    @FXML
    void onEstadoObjetos(ActionEvent event) {

        String resultado = modelFactory.obtenerEstadoObjetos();
        txtRequerimientoEstado.setText(resultado);
    }

    @FXML
    void onObjetosMenosPrestados(ActionEvent event) {
        String rango = txtRangoObjetosPrestados.getText().trim();
        if (!rango.isEmpty()) {
            try {
                String reporteObjetos = modelFactory.obtenerObjetosMenosPrestados(rango);
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

