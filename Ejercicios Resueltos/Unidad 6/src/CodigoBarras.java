import java.util.Scanner;

public class CodigoBarras {
    public static void main(String[] args) {

        CodigoBarras programa = new CodigoBarras();
        programa.inicio();
    }

    private void inicio() {

        String codigo = getCodigo();
        String codigoBarras = getCodigoBarras(codigo);
        String pais = comprobarPais(codigoBarras);
        imprimirResultado(codigoBarras, pais);


    }

    private void imprimirResultado(String codigoBarras, String pais) {
        if (isCodigoCorrecto(codigoBarras) && codigoBarras.length()==13)
            imprimirPantalla("SI " + pais);
        else if (isCodigoCorrecto(codigoBarras) && codigoBarras.length()==8)
            imprimirPantalla("SI");
        else
            imprimirPantalla("NO");

    }

    private String comprobarPais(String codigoBarras) {
        String pais="";
        if (codigoBarras.charAt(0)=='0')
            pais = "EEUU";
        else if (codigoBarras.charAt(0)=='5' && codigoBarras.charAt(1)=='0')
            pais = "Inglaterra";
        else if (codigoBarras.charAt(0)=='7' && codigoBarras.charAt(1)=='0')
            pais = "Noruega";
        else if (codigoBarras.charAt(0)=='3' && codigoBarras.charAt(1)=='8' && codigoBarras.charAt(2)=='0')
            pais = "Bulgaria";
        else if (codigoBarras.charAt(0)=='5' && codigoBarras.charAt(1)=='3' && codigoBarras.charAt(2)=='9')
            pais = "Irlanda";
        else if (codigoBarras.charAt(0)=='5' && codigoBarras.charAt(1)=='6' && codigoBarras.charAt(2)=='0')
            pais = "Portugal";
        else if (codigoBarras.charAt(0)=='7' && codigoBarras.charAt(1)=='5' && codigoBarras.charAt(2)=='9')
            pais = "Venezuela";
        else if (codigoBarras.charAt(0)=='8' && codigoBarras.charAt(1)=='5' && codigoBarras.charAt(2)=='0')
            pais = "Cuba";
        else if (codigoBarras.charAt(0)=='8' && codigoBarras.charAt(1)=='9' && codigoBarras.charAt(2)=='0')
            pais = "India";
        else
            pais = "Desconocido";
        return pais;
    }

    private void imprimirPantalla(String s) {
        System.out.print(s);
    }

    private boolean isCodigoCorrecto(String codigoBarras) {
        int ultimoDigito, suma, digitoComprobacion;

        ultimoDigito = codigoBarras.charAt(codigoBarras.length()-1)-'0';
        suma = 0;

        if (codigoBarras.length()==8){
            for (int i = codigoBarras.length()-2; i >= 0; i--) {
                if (isPar(i)){
                    suma += (codigoBarras.charAt(i) - '0')*3;
                }else
                    suma += (codigoBarras.charAt(i) - '0');
            }
        }else{
            for (int i = codigoBarras.length()-2; i >= 0; i--) {
                if (!isPar(i))
                    suma += (codigoBarras.charAt(i) - '0')*3;
                else
                    suma += (codigoBarras.charAt(i) - '0');
            }
        }
        digitoComprobacion = 10 - (suma%10);

        if (digitoComprobacion==10)
            digitoComprobacion=0;

        if (digitoComprobacion==ultimoDigito)
            return true;
        else
            return false;
    }

    private boolean isPar(int i) {
        return i%2==0;
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
        return cadena.length()<=13 && isDigitos(cadena);
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
        return sc.nextLine();
    }

}
