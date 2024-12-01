/*Escribe un programa que muestra tres apuestas de la quiniela en tres columnas para 14
partidos y el pleno al quince (15 filas).*/
public class Aleatorio07 {
    public static void main(String[] args) {

        int i;
        int resultado;
        String resulFinal="";


        System.out.println("Partido \t\t Resultado\n");

        for (i=1;i<=15;i++){

            resultado = (int)(Math.random()*(3-1+1)+1);
            resulFinal = switch (resultado) {
                case 1 -> "1";
                case 2 -> "2";
                case 3 -> "X";
                default -> resulFinal;
            };
            System.out.println("Partido "+i+ "\t\t\t"+resulFinal);
            }

        }
    }

