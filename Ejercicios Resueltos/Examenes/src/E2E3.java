import java.util.Scanner;

public class E2E3 {
    public static void main(String[] args) {

        int n, i, fibonacci=0, numAnterior=0, numActual=1;
        Scanner sc = new Scanner(System.in);

        //Solicitamos los valores de Fibonacci a calcular
        do {
            System.out.print("Número: ");
            n = sc.nextInt();
            if (n<0)
                System.out.println("Introduce un valor válido (>0)");
        }while (n<0);

        //Descartamos casos especiales
        if (n==0)
            System.out.println("m: "+n+"\nEl primer número de Fibonacci es:\n"+fibonacci);
        else if (n==1)
            System.out.println("m: "+n+"\nLos dos primeros números de Fibonacci son:\n"+numAnterior +" - "+numActual);

        //Imprimimos fuera del bucle los valores iniciales
        else {
            System.out.print("m: " + n + "\nLos " + n + " primeros números de Fibonacci son:\n" + numAnterior + " - " + numActual);

            //Obtenemos los números de la sucesión de Fibonacci
            for (i = 2; i < n; i++) {

                fibonacci = (numAnterior + numActual);
                numAnterior = numActual;
                numActual = fibonacci;

                System.out.print(" - " + fibonacci);
            }
        }
    }
}
