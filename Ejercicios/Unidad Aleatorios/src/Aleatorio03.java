/* Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja de 40 cartas:
2,3,4,5,6,7, sota, caballo, rey y as. */
public class Aleatorio03 {
    public static void main(String[] args) {

        int detPalo, numCarta;
        String palo="", carta;

        detPalo = (int)(Math.random()*(4-1+1)+1);
        switch(detPalo){
            case 1:
                palo = " de bastos";
                break;
            case 2:
                palo = " de oros";
                break;
            case 3:
                palo = " de espadas";
                break;
            case 4:
                palo = " de copas";
                break;
        }

        numCarta = (int)(Math.random()*(10-1+1)+1);
        if (numCarta == 1){
            carta = "As";
        }else if (numCarta == 8){
            carta = "Sota";
        }else if (numCarta == 9){
            carta = "Caballo";
        } else if (numCarta == 10) {
            carta = "Rey";
        }else carta = String.valueOf(numCarta);

        System.out.println(carta+palo);

    }
}
