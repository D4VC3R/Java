/* Realiza un programa que muestre al azar el nombre de una carta de la baraja francesa. Esta
baraja está dividida en cuatro palos: picas, corazones, diamantes y tréboles. Cada palo está
formado por 13 cartas, de la cuales 9 cartas son numerales y 4 literales:
2,3,4,5,6,7,8,9,10,J,Q,K y A (que sería el 1). Para convertir número en una cadena de
caracteres podemos usar String.valueOf(n).*/
public class Aleatorio02 {
    public static void main(String[] args) {

        int detPalo, numCarta;
        String palo=" ", carta;

        detPalo = (int)(Math.random()*(4-1+1)+1);
        switch(detPalo){
            case 1:
                palo = " de picas.";
                break;
                case 2:
                    palo = " de corazones.";
                    break;
                    case 3:
                        palo = " de diamantes.";
                        break;
                        case 4:
                            palo = " de tréboles.";
                            break;

        }
        numCarta = (int)(Math.random()*(13-1+1)+1);
        if (numCarta == 1){
            carta = "As";
        }else if (numCarta == 11){
            carta = "J";
        }else if (numCarta == 12){
            carta = "Q";
        } else if (numCarta == 13) {
            carta = "K";
        }else carta = String.valueOf(numCarta);

        System.out.println(carta+palo);

    }
}
