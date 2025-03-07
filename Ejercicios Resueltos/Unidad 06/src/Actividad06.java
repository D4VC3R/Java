/*Escribe un programa que lea 15 números por teclado y que los almacene en un
array. Rota los elementos de ese array, es decir, el elemento de la posició 0
debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
del array.*/
import java.util.Scanner;
public class Actividad06 {
    public static void main(String[] args) {
        
        Actividad06 programa = new Actividad06();
        programa.inicio();
    }

    private void inicio() {

        int[] array = getArray(15);
        String resultado;

        rellenarArray(array);
        rotarArray(array);
        resultado = getResultado(array);
        imprimirPantalla("Array rotado: "+resultado);


    }

    private String getResultado(int[] array) {
        String resultado ="";

        for (int i=0;i< (array.length);i++){
            resultado += array[i]+" ";
        }
        return resultado;
    }

    private void rotarArray(int[] array) {
        int ultimaPosicion = array[array.length-1];

        for (int i= array.length-1; i>0; i--){
            array[i]=array[i-1];
        }
        array[0]=ultimaPosicion;
    }


    private void rellenarArray(int[] array) {

        for(int i=0;i< array.length;i++){
            imprimirPantalla("Número "+(i+1)+": ");
            array[i]=getNumero();
        }
    }

    private int getNumero() {
        Scanner sc = new Scanner(System.in);

        return sc.nextInt();
    }

    private void imprimirPantalla(String s) {
        System.out.print(s);
    }


    private int[] getArray(int i) {
        return new int[i];
    }


}
