import java.util.Scanner;

public class Prueba13switch {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n1, n2, op, result;

        System.out.print("Operación: \n 1.Sumar \n 2.Restar \n 3.Multiplicar \n 4.Dividir \n");
        op = sc.nextInt();

        switch (op){
            case 1:
                System.out.print("Introduce un número: ");
                n1 = sc.nextInt();
                System.out.print("Introduce otro número: ");
                n2 = sc.nextInt();
                result = (n1+n2);
                System.out.println(n1 + " + " +n2+ " es igual a "+result);
                break;
            case 2:
                System.out.print("Introduce minuendo: ");
                n1 = sc.nextInt();
                System.out.print("Introduce sustraendo: ");
                n2 = sc.nextInt();
                result = (n1-n2);
                System.out.println(n1 + " - " +n2+ " es igual a "+result);
                break;
            case 3:
                System.out.print("Introduce un número: ");
                n1 = sc.nextInt();
                System.out.print("Introduce otro número: ");
                n2 = sc.nextInt();
                result = (n1*n2);
                System.out.println(n1 + " * " +n2+ " es igual a "+result);
                break;
            case 4:
                System.out.print("Introduce dividendo: ");
                n1 = sc.nextInt();
                System.out.print("Introduce divisor: ");
                n2 = sc.nextInt();
                    if(n2 == 0){
                        System.out.println("No se puede realizar esta operación");
                    }
                result = (n1/n2);
                System.out.println(n1 + " / " +n2+ " es igual a "+result);
                break;
            default: System.out.println("Selección inválida.");
        }
    }
}
