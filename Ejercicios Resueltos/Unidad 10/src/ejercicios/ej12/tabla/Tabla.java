package ejercicios.ej12.tabla;

import ejercicios.ej12.cliente.Cliente;
import ejercicios.ej12.menu.Menu;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Tabla {
    private Set<Cliente> listaClientes;

    public Tabla() {
        this.listaClientes = new TreeSet<>();
    }

    public void listarClientes() {
        System.out.println(this.listaClientes.toString());
        }


    public void darDeBajaCliente() {
        String nombre = getNombre();
        String telefono = getTelefono();
        Cliente cliente=new Cliente(nombre,telefono);
        if (listaClientes.contains(cliente)) {
            listaClientes.remove(cliente);
            System.out.println("Cliente dado de baja.");
        }else
            System.out.println("El cliente no existe.");
    }

    public void agregarCliente() {
        String nombre = getNombre();
        String telefono = getTelefono();
        Cliente cliente=new Cliente(nombre,telefono);

        if (!listaClientes.contains(cliente)) {
            listaClientes.add(cliente);
            System.out.println("Cliente añadido.");
        }else
            System.out.println("El cliente ya existe.");
    }

    private String getTelefono() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Teléfono: ");
        return sc.nextLine();
    }

    public void modificarDatos() {
        String nombre = getNombre();
        String telefono = getTelefono();
        Cliente cliente=new Cliente(nombre,telefono);

        if (listaClientes.contains(cliente)) {
            Menu.menuModificarDatos(cliente);
        }else
            System.out.println("El cliente no existe.");
    }

    private String getNombre(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre: ");
        return sc.nextLine();
    }

    @Override
    public String toString() {
        String cad ="idCliente | nombre | telefono\n---------------------\n";
        for (Cliente cliente : listaClientes) {
            cad += cliente + "\n";
        }
        return cad;
    }
}
