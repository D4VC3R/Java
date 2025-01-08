import java.util.Scanner;

public class CodigoBarras {
    public static void main(String[] args) {

        CodigoBarras programa = new CodigoBarras();
        programa.inicio();
    }

    private void inicio() {

        String codigo = getCodigo();
        String codigoBarras = getCodigoBarras(codigo);
        if (isCodigoCorrecto(codigoBarras));

    }

    private boolean isCodigoCorrecto(String codigoBarras) {
        int ultimoDigito;
        ultimoDigito = codigoBarras.charAt(codigoBarras.length()-1);
        //obtener la suma de los digitos multiplicados por 3 y 1 alternativamente.
        
    }

    private String getCodigoBarras(String codigo) {
        int longitud = codigo.length();
        if (longitud<8){
            for (int i = 0; i < 8-longitud; i++)
                codigo = "0" + codigo;

        }else if (longitud>8 && longitud<13){
            for (int i = 0; i < 13-longitud; i++)
                codigo = "0" + codigo;
        }
        return codigo;
    }

    private String getCodigo() {
        String cadena;
        do {
            cadena = getCadena();
        }while(!esCorrecto(cadena));
        return cadena;
    }

    private boolean esCorrecto(String cadena) {
        return cadena.length()<13 && isDigitos(cadena);
    }

    private boolean isDigitos(String cadena) {
        int i=0;

        while(i < cadena.length() && cadena.charAt(i)>='0' && cadena.charAt(i)<='9')
            i++;

        if (i<cadena.length())
            return false;
        else
            return true;
    }

    private String getCadena() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine().trim();
    }


}
