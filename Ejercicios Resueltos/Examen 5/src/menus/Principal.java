package menus;

import agendas.Agenda;

import java.util.Scanner;

public class Principal {
    public boolean menuPrincipal(Agenda v, Agenda m, Agenda h){
        Scanner sc = new Scanner(System.in);
        int opcion;

        v.imprimirPantalla("1.- Ventas\n2.- Marketing\n3.- Hogar\n4.- Mostrar todas las agendas\n5.- Fin.\n");
        opcion = sc.nextInt();
        boolean seguir=true;

        switch (opcion){
            case 1 : new MenuAgenda().menuAgenda(v);
                break;
            case 2 : new MenuAgenda().menuAgenda(m);
                break;
            case 3 : new MenuAgenda().menuAgenda(h);
                break;
            case 4: v.mostrarTodo(v,m,h);
                break;
            case 5: seguir = false;
                break;
        }
        return seguir;
    }
}
