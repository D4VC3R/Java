package actividades.ej01;

import actividades.ej01.enumerados.Rango;
import actividades.ej01.excepciones.EsMenorDeEdadException;
import actividades.ej01.excepciones.LimiteDeEdadException;
import actividades.ej01.excepciones.NumeroNegativoException;
import actividades.ej01.excepciones.YaEstaJubiladoException;

import java.util.Scanner;

public class Jubilacion {

    int edad, aniosJubilacion;

    public int getEdad(){
        int edad=0;
        boolean valido = true;

        do {
            try{
                imprimirPantalla("Edad: ");
                edad = Integer.parseInt(getNumPositivo());
                if(edad<=0){
                    throw new NumeroNegativoException();
                }else if (edad>120){
                    throw new LimiteDeEdadException();
                }
                valido = false;
            }catch (LimiteDeEdadException le){
                imprimirPantalla(le.getMessage());
            }catch (NumeroNegativoException ne){
                imprimirPantalla(ne.getMessage());
            }catch (NumberFormatException e) {
                imprimirPantalla("El número no es un entero.\n");
            }
        }while(valido);
        return edad;
    }

    public String getNumPositivo(){
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    public void imprimirPantalla(String s) {
        System.out.print(s);
    }

    public int getJubilacion(int edad)throws EsMenorDeEdadException, YaEstaJubiladoException{

        if (edad<18){
            throw new EsMenorDeEdadException();
        }else if (edad>=65&& edad<=120) {
            throw new YaEstaJubiladoException();
        }else
            return 65-edad;
    }

    public Rango obtenerRango(int aniosJubilacion){
        if (aniosJubilacion>20)
            return Rango.APRENDIZ;
        else if (aniosJubilacion<5)
            return Rango.NOTEFALTAMUCHO;
        else
            return Rango.EXPERTO;
    }
}
