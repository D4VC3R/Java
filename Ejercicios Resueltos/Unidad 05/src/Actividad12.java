/*Escribe un programa que lea la hora de un día con notación 24 horas y la
visualice en notación de 12 horas. En la notación de 24 horas se pondrá un
espacio para separar horas, los dos puntos y los minutos. Por ejemplo:
Hora AM (hh : mm) = 13 : 55
Son las 1:45 PM*/
import java.util.Scanner;
public class Actividad12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int hora, minutos;


        System.out.print("Hora: ");
        hora = sc.nextInt();
        sc.next();
        minutos = sc.nextInt();

        switch(hora){
            case 13,14,15,16,17,18,19,20,21,22,23:
                hora = (hora - 12);
                System.out.println(hora+":"+minutos+" PM");
                break;
            default:System.out.println(hora+":"+minutos+" AM");
        }

    }
}
