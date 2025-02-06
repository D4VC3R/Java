/*Crear una colección de 20 números enteros aleatorios menores que 100 y guárdalos en el
orden en que se vayan generando; mostrar por pantalla dicha lista una vez creada. Ordenarla
en sentido creciente y volverla a mostrar por pantalla.*/
package ejercicios.ej101;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ej01 {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<Integer>();

        //Rellenar lista con numeros aleatorios (0-100)
        for (int i = 0; i < 20; i++) {
            nums.add((int)(Math.random()*100));
        }
        System.out.println(nums);

        //Ordenar e imprimir la lista.
       Collections.sort(nums);
       System.out.println(nums);

       //Orden inverso e imprimir la lista
        nums.sort(Collections.reverseOrder());
        System.out.println(nums);
    }
}
