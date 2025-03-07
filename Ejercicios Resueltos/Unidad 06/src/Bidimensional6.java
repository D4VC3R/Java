/*Realiza un programa que sea capaz de rotar todos los elementos de una matriz
cuadrada una posición en el sentido de las agujas del reloj. La matriz debe tener
6 filas por 6 columnas y debe contener números generados al azar entre 0 y
100. Se debe mostrar tanto la matriz original como la matriz resultado, ambas
con los números convenientemente alineados*/
public class Bidimensional6 {
    public static void main(String[] args) {

        Bidimensional6 programa = new Bidimensional6();
        programa.inicio();
    }

    private void inicio() {
        int[][] nums;
        int[][] numsRotados;

        nums = crearArray(3,3);
        numsRotados = crearArray(3,3);

        rellenarArray(nums);
        imprimirArray(nums);
        rotarArray(nums, numsRotados);
        imprimirPantalla(" |-- -- --|\n | ROTADO | \n |-- -- --|\n");
        imprimirArray(numsRotados);
    }

    private void rotarArray(int[][] nums, int[][] numsRotados) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                numsRotados[j][2-i] = nums[i][j];
            }
        }
    }

    private void imprimirArray(int[][] nums) {
        for (int i = 0; i <nums.length ; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j]<10)
                imprimirPantalla("  "+nums[i][j]+" ");
                else if (nums[i][j]==100)
                    imprimirPantalla(nums[i][j]+" ");
                else
                    imprimirPantalla(" "+nums[i][j]+" ");
            }
            imprimirPantalla("\n");
        }
    }

    private void imprimirPantalla(String s) {
        System.out.print(s);
    }

    private void rellenarArray(int[][] nums) {
        for (int i = 0; i <nums.length ; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j]=getAleatorio(100,0);
            }
        }
    }

    private int getAleatorio(int max, int min) {
        return (int)(Math.random()*(max-min+1)+min);
    }


    private int[][] crearArray(int fila, int columna) {
        return new int[fila][columna];
    }
}
