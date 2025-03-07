package ejerciciosMaps.ej21;

public class Pieza {

    //Atributos
    String nombre;
    int valor;

    public Pieza(String nombre) {
        this.nombre = nombre;
        this.valor = asignarValor(this);
    }


    private int asignarValor(Pieza p){
        switch (p.getNombre().toLowerCase()){
            case "peon" : p.setValor(1);
            break;
            case "caballo" : p.setValor(2);
            break;
            case "alfil" : p.setValor(3);
            break;
            case "torre" : p.setValor(5);
            break;
            case "dama" : p.setValor(9);
        }
        return p.getValor();
    }

    public String getNombre() {
        return nombre;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return nombre.substring(0,1).toUpperCase() +nombre.substring(1).toLowerCase() + " (" + this.getValor()+" peones)";
    }
}
