package ejercicios.ej12.cliente;

import java.io.Serializable;

public class Cliente implements Comparable<Cliente>, Serializable {
    private static int id = 0;
    private String nombre;
    private String telefono;
    private int idCliente;

    //Constructor
    public Cliente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        idCliente = ++id;
    }

    //Metodos
    @Override //Si los teléfonos son diferentes, ordena por ID
    public int compareTo(Cliente o) {
        int resultado = this.telefono.compareTo(o.telefono);

        if (resultado == 0) return 0;

        return this.idCliente - o.idCliente;
    }


    @Override //Telefono como primary key para este ejercicio
    public boolean equals(Object o) {
        Cliente cliente = (Cliente) o;
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        return telefono.equals(cliente.telefono);
    }

    @Override
    public int hashCode() {
        return telefono.hashCode();
    }

    @Override
    public String toString() {
        return " | " + idCliente + " | " + nombre + " | " + telefono + " | ";
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }


}
