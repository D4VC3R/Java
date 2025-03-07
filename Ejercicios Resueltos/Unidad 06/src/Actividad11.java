import java.util.Scanner;

public class Actividad11 {
    public static void main(String[] args) {

        Actividad11 programa = new Actividad11();
        programa.inicio();
    }

    private void inicio() {

        int[] nums = getArray(10);

        rellenarArray(nums);
        imprimirIndice(nums);
        imprimirArray(nums);


    }

    private void imprimirArray(int[] nums) {
        System.out.print("Valor:\t\t");
        for (int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }

    private void imprimirIndice(int[] nums) {
        System.out.print("Índice:\t\t");
        for (int i=0;i<nums.length;i++){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    private void rellenarArray(int[] nums) {
        for (int i=0;i< nums.length;i++){
            System.out.print("Número "+(i+1)+" :");
            nums[i]=getNumero();
        }
    }

    private int getNumero() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private int[] getArray(int i) {
        return new int[i];
    }
}
