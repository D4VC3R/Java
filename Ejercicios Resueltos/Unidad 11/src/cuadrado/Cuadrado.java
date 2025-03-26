package cuadrado;

import figura.Figura;

public class Cuadrado extends Figura {

    private double lado;

    public Cuadrado(String color, double lado) {
        super(color);
        this.lado = lado;
    }

    @Override
    protected double calcularArea() {
        return lado*lado;
    }
}
