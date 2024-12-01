/* Realiza un programa que pinte por pantalla diez líneas formadas por caracteres. El carácter
con el que se pinta cada línea se elige de forma aleatoria entre uno de los siguientes: *, -, =, .,
|, @. Las líneas deben tener una longitud aleatoria entre 1 y 40 caracteres. */
public class Aleatorio10 {
    public static void main(String[] args) {

        int linea,i,simbolo,j;
        String simboloFinal="";

        for (i=1;i<=10;i++) {
            linea = (int)(Math.random()*(40)+1);
            simbolo = (int)(Math.random()*(6)+1);
            simboloFinal = switch (simbolo){
                case 1 -> "*";
                case 2 -> "-";
                case 3 -> "=";
                case 4 -> ".";
                case 5 -> "|";
                case 6 -> "@";
                default -> simboloFinal;
            };

            for (j=1;j<=linea;j++) {
                System.out.print(simboloFinal);
                }
                System.out.println();
        }
    }
}
