/*Lo he enfocado mal desde el principio y
no he podido sacar la nota final*/
import java.util.Scanner;
public class P4E1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i, alumnos,j;
        double nota;
        String notaFinal="";

        //Lectura de datos
        do {
            System.out.print("Número de alumnos americanos: ");
            alumnos = sc.nextInt();
        }while(alumnos<=0);

        //Interfaz
        System.out.println("========================================\n" +
                "\t\tNOTAS ALUMNOS AMERICANOS\t\t" +
                "\n========================================\n");
        System.out.println("           1a    2a    3a \tNota final\n" +
                "           --------------\t----------");

        //Pintamos tantas filas como alumnos haya.
        for (i=1;i<=alumnos;i++){
            if (i<=9)
                System.out.print("Alumno  " +i+ ": ");
            else System.out.print("Alumno " +i+ ": ");

        //Generación de notas aleatorias.
        for (j=1;j<=3;j++){
            nota = (Math.random()*(4)+0.1);
            if (nota<0.67)
                notaFinal = "F ";
            else if (nota>=0.67 && nota<1.00)
                notaFinal = "D-";
            else if (nota>=1.00 && nota<1.33)
                notaFinal = "D ";
            else if (nota>=1.33 && nota<1.67)
                notaFinal = "D+";
            else if (nota>=1.67 && nota<2.00)
                notaFinal = "C-";
            else if (nota>=2.00 && nota<2.33)
                notaFinal = "C ";
            else if (nota>=2.33 && nota<2.67)
                notaFinal = "C+";
            else if (nota>=2.67 && nota<3.00)
                notaFinal = "B-";
            else if (nota>=3.00 && nota<3.33)
                notaFinal = "B ";
            else if (nota>=3.33 && nota<3.67)
                notaFinal = "B+";
            else if (nota>=3.67 && nota<4)
                notaFinal = "A ";
            else notaFinal = "A+";
            System.out.print(notaFinal+"    ");
        }
            System.out.println();
        }

    }
}
