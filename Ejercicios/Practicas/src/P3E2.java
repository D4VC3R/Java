import java.util.Scanner;

public class P3E2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int min, horas, minRest, minTotal=0;

        //Lectura de datos hasta que se introduzca un 0
        do{
            System.out.print("Duración del tramo: ");
            min = sc.nextInt();
            minTotal += min;
        }while(min!=0);

        //Convertimos los minutos en horas
        horas = minTotal/60;

        //Calculamos los minutos restantes
        minRest = minTotal%60;

        //Imprimimos con el formato solicitado
        if(minRest <10){
            System.out.println("Tiempo total del viaje: " +horas+ ":0" +minRest+ " horas");
        }else
            System.out.println("Tiempo total del viaje: " +horas+ ":" +minRest+ " horas");

    }
}
