/*Escribe un programa que introduzca 20 números enteros aleatorios múltiplos de
2 en un array de 4 filas por 5 columnas. El programa mostrará las sumas
parciales de filas y columnas igual que si de una hoja de cálculo se tratara. La
suma total debe aparecer en la esquina inferior derecha*/
public class Bidimensional2 {
    public static void main(String[] args) {

        Bidimensional2 programa = new Bidimensional2();
        programa.inicio();
    }

    private void inicio() {

        int[][] array;

        array = crearArray(4,5);
        rellenarArray(array);

        imprimirArray(array);
    }

    private void imprimirArray(int[][] array) {

        for (int i=0;i < array.length;i++){
             for (int j=0;j<array[i].length;j++){
                imprimirPantalla((" "+array[i][j]+"  "));
            }
            imprimirPantalla( "|  ");
            imprimirPantalla(getSumaFila(array[i])+"\n");
        }

        imprimirPantalla("------------------------ + -----\n");

        for (int j = 0; j < array[0].length; j++) {
            imprimirPantalla(getColumnaSuma(j, array)+"  ");
        }
        imprimirPantalla("| "+getTotal(array));
    }

    private int getTotal(int[][] array) {
        int suma = 0;
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[0].length ; j++) {
                suma += array[i][j];
            }
        }
        return suma;
    }

    private int getColumnaSuma(int columna, int[][] array) {
        int suma =0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i][columna];
        }
        return suma;
    }

    private int getSumaFila(int[] fila) {
        int suma=0;
        for (int i = 0; i < fila.length; i++) {
            suma += fila[i];
        }
        return suma;
    }

    private void imprimirPantalla(String s) {
        System.out.print(s);
    }

    private void rellenarArray(int[][] array) {

        for (int i=0;i< array.length;i++){
            for (int j=0;j<array[i].length;j++){
                array [i][j]=getNumeroPar();
            }
        }
    }

    private int getNumeroPar() {
        int num;
        do {
            num = getNumeroAleatorio();
        }while(num%2!=0);
        return num;
    }

    private int getNumeroAleatorio() {
        return (int)(Math.random()*(99-10+1)+10);
    }

    private int[][] crearArray(int filas, int columnas) {
        return new int[filas][columnas];
    }
}
