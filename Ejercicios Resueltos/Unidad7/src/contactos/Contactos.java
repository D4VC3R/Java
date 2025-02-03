package contactos;

public class Contactos {

    //Atributos
    private String nombre, apellido, telefono;

    //Constructor
    public Contactos(String nombre, String apellido, String telefono) {
        setNombre(nombre);
        setApellido(apellido);
        setTelefono(telefono);
    }

    public Contactos(String telefono) {
        setTelefono(telefono);
    }

    //Metodos


    @Override
    public boolean equals(Object obj) {
        return telefono.equals(((Contactos)obj).telefono);
    }

    @Override
    public String toString() {
        return  "Nombre: " + nombre +
                "\nApellido: " + apellido +
                "\nTeléfono: " + telefono;
    }

    //Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    //Getters

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }
}
