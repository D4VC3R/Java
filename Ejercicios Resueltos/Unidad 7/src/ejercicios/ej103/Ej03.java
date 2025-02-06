/* Crear una colección de 20 números enteros aleatorios distintos menores que 100 y guárdalos
 por orden decreciente a medida que se vayan generando. Mostrar la colección por pantalla.*/
package ejercicios.ej103;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ej03 {
    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();
        int num;

        while(lista.size()<20) {
            num = (int)(Math.random()*100);
            if (!lista.contains(num)){
                lista.add(num);
                lista.sort(Collections.reverseOrder());
            }
        }
        System.out.println(lista);
    }
}
