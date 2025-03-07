package radio;

public class SintonizadorFM {

    //Atributos

    private double frecuencia;
    static final int FREC_MAX = 108;
    static final int FREC_MIN = 80;

    //Constructor
    public SintonizadorFM() {
        setFrecuencia(80);
    }

    //Metodos
    private void setFrecuencia(double frecuencia) {
        this.frecuencia = frecuencia;
    }
    public double getFrecuencia(){
        return frecuencia;
    }
    public void upFrecuencia (){
        if (getFrecuencia()+0.5>FREC_MAX){
            setFrecuencia(FREC_MIN);
        }else
            setFrecuencia(frecuencia+0.5);
    }
    public void downFrecuencia (){
        if (getFrecuencia()-0.5<FREC_MIN){
            setFrecuencia(FREC_MAX);
        }else
            setFrecuencia(frecuencia-0.5);
    }
    public void display(){
        System.out.println(frecuencia);
    }

}
