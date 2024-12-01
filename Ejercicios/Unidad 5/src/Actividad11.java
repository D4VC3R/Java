/*Escribe un programa que acepte fechas escritas de un modo normal (2 de
febrero de 1989) y la visualice como tres números separados con una barra de
división.*/
import java.util.Scanner;
public class Actividad11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String mes, ano, mesNum="00";
        int dia;

        System.out.print("Introduce la fecha: ");
        dia = sc.nextInt();
        sc.next();
        mes = sc.next();
        sc.next();
        ano = sc.next();

        switch(mes.toLowerCase()){
            case"enero":mesNum="01";
            break;
            case"febrero":mesNum="02";
            break;
            case"marzo":mesNum="03";
            break;
            case"abril":mesNum="04";
            break;
            case"mayo":mesNum="05";
            break;
            case"junio":mesNum="06";
            break;
            case"julio":mesNum="07";
            break;
            case"agosto":mesNum="08";
            break;
            case"septiembre":mesNum="09";
            break;
            case"setiembre":mesNum="09";
            break;
            case"octubre":mesNum="10";
            break;
            case"noviembre":mesNum="11";
            break;
            case"diciembre":mesNum="12";
            break;
            default:
                System.out.println("Fecha inválida.");
        }
        if(dia>=1 && dia<=9){
            System.out.println("0"+dia+"/"+mesNum+"/"+ano);
        }else
            System.out.println(dia+"/"+mesNum+"/"+ano);

    }
}
