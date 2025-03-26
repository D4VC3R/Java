package ejercicios.ej12.menu;

import ejercicios.ej12.cliente.Cliente;
import ejercicios.ej12.tabla.Tabla;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private final Tabla tabla;
    private final Scanner sc;

    //Constructor
    public Menu(Tabla tabla) {
        this.tabla = tabla;
        this.sc = new Scanner(System.in);
    }

    //Metodos
    public void mostrarMenu() {
        menuInicial();
    }

    private void menuInicial() {

        int opcion;
        boolean opcionValida = false;

        do {
            System.out.println("Menú principal\n-----------------\n1. Añadir nuevo cliente" +
                    "\n2. Modificar datos\n3. Dar de baja Cliente\n4. Listar clientes \n5. Salir.");
            try {
                opcion = Integer.parseInt(sc.nextLine());
                if (opcion>=1 && opcion<=5){
                    switch (opcion){
                        case 1: tabla.agregarCliente();
                        break;
                        case 2: menuModificarDatos();
                        break;
                        case 3: tabla.darDeBajaCliente();
                        break;
                        case 4: tabla.listarClientes();
                        break;
                        case 5: tabla.guardarTabla(); opcionValida = true;
                        break;
                    }
                }
            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        }while (!opcionValida);

    }

    private void menuModificarDatos() {

        if (tabla.getListaClientes().isEmpty()) {
            System.out.println("No hay clientes registrados.");
        } else {

            int opcion;
            boolean opcionValida = false;

            do {

                System.out.println("Introduce el telefono del cliente que deseas modificar:");
                Cliente cliente = new Cliente("", sc.nextLine());

                if (!tabla.getListaClientes().contains(cliente)) {
                    System.out.println("Cliente no encontrado.");

                } else {
                    System.out.println("¿Que campo deseas modificar?");
                    System.out.println("1. Nombre\n2. Teléfono\n3. Salir.");
                    try {
                        opcion = Integer.parseInt(sc.nextLine());
                        if (opcion >= 1 && opcion <= 3) {
                            switch (opcion) {
                                case 1:
                                    tabla.modificarDatos(cliente, 1);
                                    break;
                                case 2:
                                    tabla.modificarDatos(cliente, 2);
                                    break;
                                case 3:
                                    break;
                            }
                            opcionValida = true;
                        } else
                            System.out.println("Opción inválida.");

                    } catch (NumberFormatException | InputMismatchException e) {
                        System.out.println(e.getMessage());
                    }
                }
            } while (!opcionValida);
        }
    }
}
