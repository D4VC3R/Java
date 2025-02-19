import java.util.Scanner;

public class TestExcepcion {
    public static void main(String[] args) {
 
        int asteriscos, lineas;
        
        System.out.println("Asteriscos: ");
        asteriscos = getNumero();
        
        System.out.println("Lineas: ");
        lineas = getNumero();

        pintarTabla(asteriscos, lineas);
        

    }

    private static void pintarTabla(int asteriscos, int lineas) {
        int sobrante = getSobrante(asteriscos, lineas);
        int astXlinea= asteriscos/lineas;

        if (sobrante == 0){
        for (int i = 0; i < lineas; i++) {
            System.out.print("Linea " + i +": ");
            for (int j = 0; j < astXlinea; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        }


    }


    private static int getSobrante(int asteriscos, int lineas) {
        return asteriscos % lineas;
    }

    private static int getNumero() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
