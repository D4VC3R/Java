package ejercicios.ej12.tabla;

import ejercicios.ej12.cliente.Cliente;
import ejercicios.ej12.menu.Menu;
import ejercicios.ej12.misclases.MyObjectOutputStream;

import java.io.*;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Tabla {
    private Set<Cliente> listaClientes;
    private String rutaArchivo;

    public Tabla(String rutaArchivo) {
        this.listaClientes = new TreeSet<>();
        this.rutaArchivo = rutaArchivo;
    }

    public void listarClientes() {
        System.out.print(this);
        if (this.listaClientes.isEmpty())
            System.out.println("No hay clientes.\n");
    }

    public void leerArchivo(String rutaArchivo){
        try(ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(rutaArchivo))) {
            while(true){
                entrada.readObject();
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public void guardarTabla(){

        try(MyObjectOutputStream salida = new MyObjectOutputStream(rutaArchivo,true)) {
            salida.writeObject(listaClientes);
        } catch (IOException e) {
            System.out.println("Archivo guardado.");
        }

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

    public String getRutaArchivo() {
        return rutaArchivo;
    }

    @Override
    public String toString() {
        String cad ="idCliente | nombre | telefono\n----------------------------\n";
        for (Cliente cliente : listaClientes) {
            cad += cliente + "\n";
        }
        return cad;
    }
}
