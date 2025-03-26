package ejercicios.ej08.etiqueta;

public class Etiqueta {
    String nombre, destinatario, direccion;

    public Etiqueta(String nombre, String destinatario, String direccion) {
        this.nombre = nombre;
        this.destinatario = destinatario;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Destinatario: "+destinatario+"\nDireccion: "+direccion;
    }
}
