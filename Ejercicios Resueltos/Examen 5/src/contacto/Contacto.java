package contacto;

public class Contacto {
    //Atributos
    private String nombre, sexo, telefono, direccion;
    private int edad;

    //Constructor

    public Contacto(String nombre, String sexo, String telefono, String direccion, int edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.edad = edad;
    }


    @Override
    public String toString() {
        return nombre +" / "+ sexo +" / "+ edad +" / "+ telefono +" / "+ direccion +"\n";
    }
}
