public class Texto {

    private String cadena="";
    private int longitudMax;

    //Constructor
    Texto(int longitudMax){
        setLongitudMax(longitudMax);

    }

    private void setLongitudMax(int longitudMax) {
        this.longitudMax = longitudMax;
    }
}
