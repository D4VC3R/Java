package ejercicios.ej12.tabla;

import ejercicios.ej12.cliente.Cliente;
import ejercicios.ej12.menu.Menu;
import ejercicios.ej12.misclases.MyObjectOutputStream;

import java.io.*;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Tabla implements Serializable {
    private Set<Cliente> listaClientes;
    private String rutaArchivo;
    private final Scanner sc;
    /*He creado aqui el Scanner para tenerlo en todos los metodos de tabla,
    no se si seria correcto pero me ha venido genial.*/

    //Constructor
    public Tabla(String rutaArchivo) {
        this.listaClientes = new TreeSet<>();
        this.rutaArchivo = rutaArchivo;
        this.sc = new Scanner(System.in);
        leerArchivo(rutaArchivo);
    }

    //Metodos
    public void listarClientes() {
        if (this.listaClientes.isEmpty()) {
            System.out.println("No hay clientes.\n");
            return;
        }
        System.out.print(this.listaClientes);

    }

    //Leer la lista de clientes completa de una sola vez
    public void leerArchivo(String rutaArchivo){
        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(rutaArchivo))) {
            listaClientes = (Set<Cliente>) entrada.readObject();
            System.out.println("Archivo leído.");
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado. Se iniciará con una lista vacía.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    //Guardar la lista de clientes de golpe.
    public void guardarTabla() {
        try (MyObjectOutputStream salida = new MyObjectOutputStream(rutaArchivo,0)) {
            salida.writeObject(listaClientes);
            System.out.println("Archivo guardado.");
        } catch (IOException e) {
            System.out.println("Error al guardar: " + e.getMessage());
        }
    }

    public void darDeBajaCliente() {
        if (listaClientes.isEmpty()) {
            System.out.println("No hay clientes.");
            return;
        }
        //Se solicita la primary key del cliente y si existe, se da de baja.
        String telefono = getTelefono();
        Cliente cliente=new Cliente("",telefono);

        if (listaClientes.contains(cliente)) {
            listaClientes.remove(cliente);
            System.out.println("Cliente dado de baja.");
        }else
            System.out.println("El cliente no existe.");
    }

    //Agregar clientes si no existen
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

    //No he sabido modificar los datos de un cliente ya existente en la lista
    //Lo que hago es borrar el existente y guardar uno nuevo con los datos modificados.
    public void modificarDatos(Cliente cliente, int opcion) {

        if (opcion==1) {
            String telefono = cliente.getTelefono();
            listaClientes.remove(cliente);
            listaClientes.add(new Cliente(getNombre(),telefono));
        }else {
            String nombre = cliente.getNombre();
            listaClientes.remove(cliente);
            listaClientes.add(new Cliente(nombre,getTelefono()));
        }

    }

    //Getters
    private String getTelefono() {
        System.out.print("Teléfono: ");
        return sc.nextLine();
    }

    private String getNombre(){
        System.out.print("Nombre: ");
        return sc.nextLine();
    }

    public Set<Cliente> getListaClientes() {
        return listaClientes;
    }

    @Override
    public String toString() {
        String cad ="idCliente | Nombre | Telefono\n----------------------------\n";
        for (Cliente cliente : listaClientes) {
            cad += cliente + "\n";
        }
        return cad;
    }
}
