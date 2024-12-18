/*Crear un array bidimensional
* Leer las dimensiones*/
public class Bidimensional {
    public static void main(String[] args) {

        Bidimensional programa = new Bidimensional();
        programa.inicio();
    }

    private void inicio() {

        int[][] array;

        array = getDimension(3,6);
        asignarNums(array);
        interfaz(array);
        imprimirArray(array);

    }

    private void interfaz(int[][] array) {
        imprimirPantalla("Array num | ");
        for (int i=0;i< array[0].length;i++){
            imprimirPantalla("Columna "+(i+1)+" | ");
        }
        imprimirPantalla("\n====================================" +
                "===============================================\n");
    }

    private void asignarNums(int[][] array) {

        array[0][0] = 0;
        array[0][1] = 30;
        array[0][2] = 2;
        array[0][5] = 5;
        array[1][0] = 75;
        array[1][4] = 0;
        array[2][2] = -2;
        array[2][3] = 9;
        array[2][5] = 11;

    }

    private void imprimirArray(int[][] array) {
        for (int i=0;i< array.length;i++){
            imprimirPantalla("Fila "+(i+1)+":");
            for (int j=0;j<(array[0].length);j++){
                System.out.printf("%12d",array[i][j]);
            }
            imprimirPantalla("\n");
        }
    }

    private boolean isCero(int i) {
        return i == 0;
    }


    private void imprimirPantalla(String s) {
        System.out.printf(s);
    }

    private int[][] getDimension(int filas, int columnas) {
        return new int[filas][columnas];
    }
}
