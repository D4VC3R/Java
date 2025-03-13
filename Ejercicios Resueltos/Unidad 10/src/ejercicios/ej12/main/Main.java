package ejercicios.ej12.main;


import ejercicios.ej12.menu.Menu;
import ejercicios.ej12.tabla.Tabla;

import java.io.File;


public class Main {
    public static void main(String[] args) {

        Tabla tabla = new Tabla(System.getProperty("user.dir") + File.separator + "src" + File.separator + "archivos" + File.separator + "clientes.dat");

        if (new File(tabla.getRutaArchivo()).exists()){
            tabla.leerArchivo(tabla.getRutaArchivo());
            Menu.menuInicial(tabla);
        }else
            Menu.menuInicial(tabla);
    }

}
