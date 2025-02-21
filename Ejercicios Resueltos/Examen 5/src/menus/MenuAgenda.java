package menus;

import agendas.Agenda;
import java.util.Scanner;

public class MenuAgenda {

    public void menuAgenda(Agenda a){
        Scanner sc = new Scanner(System.in);
        int opcion;
        a.imprimirPantalla("1.- Alta contacto\n2.- Mostrar contactos\n3.- Eliminar Contacto\n");
        opcion = sc.nextInt();

        switch (opcion){
            case 1 : a.addContacto(a);
                break;
            case 2: a.mostrarContactos(a);
                break;
            case 3 : a.eliminarContacto(a);
                break;
        }
    }
}
