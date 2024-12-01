/* Muestra 20 números enteros entre 0 y 10 (ambos incluidos) separados por espacios.  */
public class Aleatorio4 {
    public static void main(String[] args) {

        int i;

        for (i = 1; i <= 20; i++) {
            System.out.println("Número "+i+": "+(int) (Math.random()*(10+1))+" ");
        }
    }
}
