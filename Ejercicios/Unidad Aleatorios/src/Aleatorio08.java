/* Modifica el programa anterior para que la probabilidad de que salga un 1 sea de 1/2, la
probabilidad de que salga X sea de 1/3 y la probabilidad de que salga 2 sea de 1/6. Pista: 1/2
= 3/6 y 1/3 =2/6. */
public class Aleatorio08 {
    public static void main(String[] args) {

        int i;
        int resultado;
        String resulFinal="";


        System.out.println("Partido \t\t Resultado\n");

        for (i=1;i<=15;i++){

            resultado = (int)(Math.random()*(6-1+1)+1);
            resulFinal = switch (resultado) {
                case 1,2,3 -> "1";
                case 4,5 -> "X";
                case 6 -> "2";
                default -> resulFinal;
            };
            System.out.println("Partido "+i+ "\t\t\t"+resulFinal);
        }

    }
}

