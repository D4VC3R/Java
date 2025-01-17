package pruebas;
import alumno.Alumno;
import dispositivos.Pantalla;

public class PruebaAlumno {
    public static void main(String[] args) {

        Pantalla monitor = new Pantalla();
        Alumno alumno = new Alumno("David");

        alumno.asignarNota(5.7);

        monitor.imprimir(alumno.nombre+ ": Aprobao: " + alumno.notaMedia);

    }
}
