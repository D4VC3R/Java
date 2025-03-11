package ejercicios.ej12.main;

import ejercicios.ej12.cliente.Cliente;
import ejercicios.ej12.menu.Menu;
import ejercicios.ej12.tabla.Tabla;

public class Main {
    public static void main(String[] args) {

        Tabla tabla = new Tabla();

        Menu.menuInicial(tabla);
    }
}
