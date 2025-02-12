package ejercicios;
import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            nums.add((int)(Math.random()*(100)));
        }
        System.out.println("----------------\nAntes de ordenar\n----------------");
        for (Integer n : nums) {
            System.out.print(n.toString() + " ");
        }

        System.out.println("\n----------------\nOrden creciente\n---------------");
        Collections.sort(nums);

        for (Integer n : nums) {
            System.out.print(n.toString() + " ");
        }

        System.out.println("\n----------------\nOrden decreciente\n-----------------");

        nums.sort(Collections.reverseOrder());

        for (Integer n : nums) {
            System.out.print(n.toString() + " ");
        }
    }
}
