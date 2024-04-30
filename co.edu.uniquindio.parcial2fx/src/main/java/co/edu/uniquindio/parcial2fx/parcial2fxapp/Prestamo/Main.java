package co.edu.uniquindio.parcial2fx.parcial2fxapp.Prestamo;

import co.edu.uniquindio.parcial2fx.parcial2fxapp.Prestamo.Model.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        inicializarDatos();

    }

    private static void inicializarDatos() {

        PrestamoUq prestamoUq = new PrestamoUq();
        prestamoUq.setNombre("Objetos de biblioteca");

        Cliente cliente = new Cliente();
        cliente.setNombre("Carolina");
        cliente.setApellido("Paz");
        cliente.setCedula("100594");
        cliente.setEdad(20);
        cliente.setOwnedByPrestamoUq(prestamoUq);

        Cliente cliente1 = new Cliente();
        cliente1.setNombre("María");
        cliente1.setApellido("Ruiz");
        cliente1.setCedula("110594");
        cliente1.setEdad(32);
        cliente1.setOwnedByPrestamoUq(prestamoUq);

        Cliente cliente2 = new Cliente();
        cliente2.setNombre("Ivana");
        cliente2.setApellido("Mora");
        cliente2.setCedula("109494");
        cliente2.setEdad(22);
        cliente2.setOwnedByPrestamoUq(prestamoUq);

        Empleado empleado = new Empleado();
        empleado.setNombre("Julio");
        empleado.setApellido("Marin");
        empleado.setCedula("146523");
        empleado.setEdad(45);
        empleado.setOwnedByPrestamoUq(prestamoUq);

        Empleado empleado1 = new Empleado();
        empleado1.setNombre("Sara");
        empleado1.setApellido("Cruz");
        empleado1.setCedula("148953");
        empleado1.setEdad(37);
        empleado1.setOwnedByPrestamoUq(prestamoUq);

        Prestamo prestamo = new Prestamo();
        prestamo.setNumeroPrestamo("PO-001");
        prestamo.setFechaPrestamo(new Date(24,1,5));
        prestamo.setFechaEntrega(new Date(24,2,5));
        prestamo.setDescripcion("Prestamo a un mes");

        Prestamo prestamo1 = new Prestamo();
        prestamo1.setNumeroPrestamo("PO-002");
        prestamo1.setFechaPrestamo(new Date(24,2,1));
        prestamo1.setFechaEntrega(new Date(24,2,15));
        prestamo1.setDescripcion("Prestamo a quince días");

        Prestamo prestamo2 = new Prestamo();
        prestamo2.setNumeroPrestamo("PO-003");
        prestamo2.setFechaPrestamo(new Date(24,3,6));
        prestamo2.setFechaEntrega(new Date(24,3,26));
        prestamo2.setDescripcion("Prestamo a veinte días");

        Objeto objeto = new Objeto();
        objeto.setNombre("Libro");
        objeto.setCodigoId("1234");
        objeto.setOwnedByPrestamoUq(prestamoUq);

        Objeto objeto1 = new Objeto();
        objeto1.setNombre("Comic");
        objeto1.setCodigoId("5678");
        objeto1.setOwnedByPrestamoUq(prestamoUq);

        Objeto objeto2 = new Objeto();
        objeto2.setNombre("Enciclopedia");
        objeto2.setCodigoId("9012");
        objeto2.setOwnedByPrestamoUq(prestamoUq);

        Objeto objeto3 = new Objeto();
        objeto3.setNombre("Mapamundi");
        objeto3.setCodigoId("3456");
        objeto3.setOwnedByPrestamoUq(prestamoUq);

        prestamoUq.getListaPrestamos().add(prestamo);
        prestamoUq.getListaPrestamos().add(prestamo1);
        prestamoUq.getListaPrestamos().add(prestamo2);
        prestamoUq.getListaEmpleados().add(empleado);
        prestamoUq.getListaEmpleados().add(empleado1);
        prestamoUq.getListaClientes().add(cliente);
        prestamoUq.getListaClientes().add(cliente1);
        prestamoUq.getListaClientes().add(cliente2);
        prestamoUq.getListaObjetos().add(objeto);
        prestamoUq.getListaObjetos().add(objeto1);

        prestamo.setClienteAsociado(prestamoUq.getListaClientes().get(0));
        prestamo.setEmpleadoAsociado(prestamoUq.getListaEmpleados().get(0));
        prestamo.getListaObjetosAsociados().add(prestamoUq.getListaObjetos().get(0));
        prestamo.getListaObjetosAsociados().add(prestamoUq.getListaObjetos().get(0));

        prestamo1.setClienteAsociado(prestamoUq.getListaClientes().get(1));
        prestamo1.setEmpleadoAsociado(prestamoUq.getListaEmpleados().get(1));
        prestamo1.getListaObjetosAsociados().add(prestamoUq.getListaObjetos().get(1));

        prestamo2.setClienteAsociado(prestamoUq.getListaClientes().get(2));
        prestamo2.setEmpleadoAsociado(prestamoUq.getListaEmpleados().get(1));
        prestamo2.getListaObjetosAsociados().add(prestamoUq.getListaObjetos().get(2));

        cliente.getListaPrestamosAsociados().add(prestamo);
        cliente1.getListaPrestamosAsociados().add(prestamo1);
        cliente2.getListaPrestamosAsociados().add(prestamo2);

        empleado.getListaPrestamosAsociados().add(prestamo);
        empleado1.getListaPrestamosAsociados().add(prestamo1);
        empleado1.getListaPrestamosAsociados().add(prestamo2);


    }
}
