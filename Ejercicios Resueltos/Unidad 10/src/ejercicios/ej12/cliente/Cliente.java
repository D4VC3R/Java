package ejercicios.ej12.cliente;

public class Cliente implements Comparable<Cliente> {
    private static int id = 0;
    private String nombre;
    private String telefono;
    private int idCliente;

    public Cliente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        idCliente = ++id;
    }

    //Metodos
    @Override //Si al comparar tele
    public int compareTo(Cliente o) {
        int resultado = this.telefono.compareTo(o.telefono);

        if (resultado == 0) return 0;

        return this.idCliente - o.idCliente;
    }


    @Override
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getIdCliente() {
        return idCliente;
    }

}
