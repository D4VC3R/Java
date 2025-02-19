package actividades.ej01;
import actividades.ej01.excepciones.EsMenorDeEdadException;
import actividades.ej01.excepciones.LimiteDeEdadException;
import actividades.ej01.excepciones.NumeroNegativoException;
import actividades.ej01.excepciones.YaEstaJubiladoException;

public class MainJubilacion {
    public static void main(String[] args) {

        Jubilacion j1 = new Jubilacion();
        int edad, aniosJubilacion;

        edad = j1.getEdad();
        try{
            aniosJubilacion = j1.getJubilacion(edad);
            j1.imprimirPantalla("Te quedan " + aniosJubilacion + " años para jubilarte.");
            j1.imprimirPantalla("\nTu rango es " + j1.obtenerRango(aniosJubilacion));
        }catch (EsMenorDeEdadException ee){
            j1.imprimirPantalla(ee.getMessage());
        }catch (YaEstaJubiladoException je){
            j1.imprimirPantalla(je.getMessage());
        }
    }
}
