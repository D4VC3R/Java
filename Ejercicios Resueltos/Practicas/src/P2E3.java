import java.util.Scanner;

public class P2E3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int edChico, edChica;

        System.out.print("Edad del chico: ");
        edChico = sc.nextInt();
        System.out.print("Edad de la chica: ");
        edChica = sc.nextInt();

        //Comprobación y determinación de la hora de vuelta.

        if(edChico>=18 && edChica>=18)
            System.out.println("Pueden volver a la hora que quieran.");
        else if(edChico<18 && edChica>=18)
            System.out.println("Deben volver a las 2 de la mañana.");
        else if(edChico>=18 && edChica<18)
            System.out.println("Deben volver a las 12 de la noche.");
        else
            System.out.println("Son menores y no pueden salir.");


    }
}
