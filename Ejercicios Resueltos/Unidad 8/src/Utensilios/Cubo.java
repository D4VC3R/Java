package Utensilios;

public class Cubo {

    //Atributos
    private int capacidadMax;
    private String color = "Sin color";
    private String material;
    private boolean asa = true;
    private int contenidoLiquido = 0;

    //Setters

    private void setCapacidadMax(int capacidad){
        capacidadMax = capacidad;
    }
    private void setMaterial (String material){
        this.material = material;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setAsa(boolean asa){
        this.asa = asa;
    }

    public void setContenidoLiquido(int contenidoLiquido){
        if (contenidoLiquido + getContenidoLiquido()<=getCapacidadMax()) {
            this.contenidoLiquido += contenidoLiquido;
        }else {
            System.out.println("Cubo lleno, se han añadido " + (capacidadMax-getContenidoLiquido())+" litros y ha/han sobrado "+((getContenidoLiquido()+contenidoLiquido)-capacidadMax)+" litro/s");
            this.contenidoLiquido = capacidadMax;
        }
    }

    //Getters

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public boolean isAsa() {
        return asa;
    }

    public int getContenidoLiquido() {
        return contenidoLiquido;
    }
    //Constructor

    public Cubo(int capacidadMax, String material) {
        this.capacidadMax = capacidadMax;
        this.material = material;
    }

    //Métodos

    public boolean llenar(){
        return capacidadMax == contenidoLiquido;
    }
    public boolean vaciar(){
        return contenidoLiquido == 0;
    }
    public void ponerAgua(int cantidadAPoner){
        contenidoLiquido += cantidadAPoner;
    }
    public void quitarAgua(int cantidadAQuitar){
        contenidoLiquido -= cantidadAQuitar;
    }
}
