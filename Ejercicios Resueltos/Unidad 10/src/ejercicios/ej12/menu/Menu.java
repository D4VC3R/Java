package ejercicios.ej12.menu;

import ejercicios.ej12.cliente.Cliente;
import ejercicios.ej12.tabla.Tabla;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {



    public static void menuInicial(Tabla tabla) {
        Scanner sc = new Scanner(System.in);
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
                        case 2: tabla.modificarDatos();
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


    public static void menuModificarDatos(Cliente cliente) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        boolean opcionValida = false;

        do {
            System.out.println("¿Que campo deseas modificar?");
            System.out.println("1. Nombre\n2. Teléfono\n3. Salir.");
            try {
                opcion = Integer.parseInt(sc.nextLine());
                if (opcion>=1 && opcion<=3){
                    switch (opcion){
                        case 1: cliente.setNombre(sc.nextLine());
                        break;
                        case 2: cliente.setTelefono(sc.nextLine());
                        break;
                        case 3: opcionValida = true;
                    }
                    opcionValida = true;
            }else
                    System.out.println("Opción inválida.");

            }catch (NumberFormatException | InputMismatchException e){
                System.out.println(e.getMessage());
            }
        }while(!opcionValida);


    }

}
