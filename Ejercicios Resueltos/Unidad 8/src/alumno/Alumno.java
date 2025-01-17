package alumno;

import dispositivos.Pantalla;

public class Alumno {

    public String nombre;
    public double notaMedia;

    public Alumno(String nombre) {
        this.nombre = nombre;
    }


    //Metodo
    public void asignarNota(double notaMedia) {
        Pantalla monitor = new Pantalla();

        if (notaMedia < 0 || notaMedia > 10)
            monitor.imprimir("Nota incorrecta.");
        else
            this.notaMedia = notaMedia;
    }

}
