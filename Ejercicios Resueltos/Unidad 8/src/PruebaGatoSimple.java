public class PruebaGatoSimple {
    public static void main(String[] args) {

        GatoSimple gato1 = new GatoSimple();
        GatoSimple gato2 = new GatoSimple();

        gato1.color="Naranja";
        gato1.raza="Siamés";
        gato1.sexo="Macho";
        gato1.edad=5;
        gato1.peso=8.6;

        gato2.color="Negro";
        gato2.raza="Persa";
        gato2.sexo="Hermafrodita";
        gato2.edad=6;
        gato2.peso=7.9;

        gato1.maullar();
        gato2.ronronear();
        gato1.pelear(gato2);
        gato1.peso();
        gato1.comer();
        gato1.peso();
    }
}
