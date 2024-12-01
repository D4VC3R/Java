import java.util.Scanner;

public class Prueba13 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n1, n2, selec, op;

        System.out.print("Operación: \n 1.Sumar \n 2.Restar \n 3.Multiplicar \n 4.Dividir \n");
        selec = sc.nextInt();

        if(selec == 1){
            System.out.print("Introduce un número: ");
            n1 = sc.nextInt();
            System.out.print("Introduce otro número: ");
            n2 = sc.nextInt();
            op = (n1+n2);
            System.out.println(n1 + " + " +n2+ " es igual a "+op);
        }else if (selec==2){
            System.out.print("Introduce minuendo: ");
            n1 = sc.nextInt();
            System.out.print("Introduce sustraendo: ");
            n2 = sc.nextInt();
            op = (n1-n2);
            System.out.println(n1 + " - " +n2+ " es igual a "+op);
        }else if (selec == 3){
            System.out.print("Introduce un número: ");
            n1 = sc.nextInt();
            System.out.print("Introduce otro número: ");
            n2 = sc.nextInt();
            op = (n1*n2);
            System.out.println(n1 + " * " +n2+ " es igual a "+op);
        }else if (selec == 4){
            System.out.print("Introduce dividendo: ");
            n1 = sc.nextInt();
            System.out.print("Introduce divisor: ");
            n2 = sc.nextInt();
            op = (n1/n2);
            System.out.println(n1 + " / " +n2+ " es igual a "+op);
        }
    }
}
