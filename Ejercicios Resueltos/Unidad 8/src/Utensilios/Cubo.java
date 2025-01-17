package Utensilios;

public class Cubo {

    //Atributos
    private int capacidadMax;
    private String color = "Sin color";
    private String material;
    private boolean asa = true;
    private double contenidoLiquido = 0.0;

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

    public void setContenidoLiquido(double contenidoLiquido){
        if (contenidoLiquido + getContenidoLiquido()<=getCapacidadMax()) {
            this.contenidoLiquido += contenidoLiquido;
        }else {
            this.contenidoLiquido = capacidadMax;
            System.out.println("Cubo lleno, se han añadido " + (capacidadMax - getContenidoLiquido()));
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

    public double getContenidoLiquido() {
        return contenidoLiquido;
    }
    //Constructor

    Cubo(int capacidadMax, String material) {
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
    public void ponerAgua(double cantidadAPoner){
        contenidoLiquido += cantidadAPoner;
    }
    public void quitarAgua(double cantidadAQuitar){
        contenidoLiquido -= cantidadAQuitar;
    }
}
