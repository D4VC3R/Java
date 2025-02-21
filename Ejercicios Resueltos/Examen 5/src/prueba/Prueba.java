package prueba;

import agendas.Agenda;
import menus.Principal;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {

        Prueba programa = new Prueba();
        programa.inicio();
    }

    private void inicio() {
        boolean seguir=true;
        Agenda v = new Agenda("Ventas");
        Agenda m = new Agenda("Marketing");
        Agenda h = new Agenda("Hogar");
        Principal menu = new Principal();

        System.out.println("ELIGE UNA AGENDA\n-------------------");
        do {
            seguir = menu.menuPrincipal(v,m,h);
        }while(seguir);

    }
}

    /* Crec que els menus están millor en clases separades pero no estic segur.

    public boolean menuPrincipal(Agenda v, Agenda m, Agenda h, boolean seguir){
        Scanner sc = new Scanner(System.in);
        int opcion;

        imprimirPantalla("1.- Ventas\n2.- Marketing\n3.- Mostrar agendas\n4.- Fin");
        opcion = sc.nextInt();
        switch (opcion){
            case 1 : menuAgenda(v);
            break;
            case 2 : menuAgenda(m);
            break;
            case 3 : menuAgenda(h);
            break;
            case 4: v.mostrarTodo(v,m);
            break;
            case 5: seguir = false;
            break;
        }
        return seguir;
    }
    public void menuAgenda(Agenda a){
        Scanner sc = new Scanner(System.in);
        int opcion;
        imprimirPantalla("1.- Alta contacto\n2.- Mostrar contactos\n3.- Eliminar Contacto");
        opcion = sc.nextInt();
        switch (opcion){
            case 1 : a.addContacto(a);
            break;
            case 2: a.mostrarContactos(a);
            break;
            case 3 : a.eliminarContacto(a);
            break;
        }
    }*/

