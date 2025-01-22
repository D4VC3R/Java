import java.util.Scanner;

public class ISBN {
    public static void main(String[] args) {

        ISBN programa = new ISBN();
        programa.inicio();
    }

    private void inicio() {

        String isbn=getIsbn();
        int calculo = calcularIsbn(isbn);
        int faltante = repararIsbn(isbn);

        if (isValido(calculo))
            imprimirPantalla("El ISBN es válido");
        else {
            imprimirPantalla("El ISBN no es válido.");
            for (int i = 0; i <isbn.length() ; i++) {
                if (isbn.charAt(i)=='?')
                    imprimirPantalla("\nEl caracter faltante es: "+faltante);
            }
        }
    }

    private int repararIsbn(String isbn) {
        char[] digitos = isbn.toCharArray();
        int[] numMultiplicado = getArray(isbn.length());
        int resultado=0;
        int cont=10;
        int faltante=0;

        for (int i = 0; i < isbn.length(); i++) {
            if ((digitos[i] != 'x') || (digitos[i] != 'X') && (digitos[i]!='?')){
                numMultiplicado[i] = cont * (digitos[i] - '0');
                cont--;
            }else if ((digitos[i] == '?')) {
                digitos[i] = 0;
                numMultiplicado[i] = cont * (digitos[i]);
                cont--;
            }else {
                numMultiplicado[i] = cont * (digitos[i] - '0');
                cont--;
            }
        }
        for (int i = 0; i <numMultiplicado.length ; i++) {
            resultado += numMultiplicado[i];
        }
        if (!isValido(resultado)){
            faltante = resultado%11;
        }
        return faltante;
    }

    private boolean isValido(int calculo) {
        return calculo%11==0;
    }

    private int calcularIsbn(String isbn) {
        char[] digitos = isbn.toCharArray();
        int[] numMultiplicado = getArray(isbn.length());
        int resultado=0;
        int cont=10;

        for (int i = 0; i < isbn.length(); i++) {
                if ((digitos[i] == 'x') || (digitos[i] == 'X')){
                    digitos[i] = 10;
                    numMultiplicado[i] = cont * (digitos[i]);
                } else {
                    numMultiplicado[i] = cont * (digitos[i] - '0');
                    cont--;
            }
        }
        for (int i = 0; i <numMultiplicado.length ; i++) {
            resultado += numMultiplicado[i];
        }
        return resultado;
    }

    private int[] getArray(int length) {
        return new int[length];
    }

    private String getIsbn() {
        Scanner sc = new Scanner(System.in);
        String cadena;
        do {
            imprimirPantalla("Introduzca ISBN: ");
            cadena = sc.next();
            if (cadena.length()!=10)
                imprimirPantalla("El ISBN debe ser de 10 dígitos.\n");
        }while(cadena.length()!=10);
        return cadena;

    }

    private void imprimirPantalla(String s) {
        System.out.print(s);
    }
}
