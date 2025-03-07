package ejercicios.ej213;

import ejerciciosMaps.ej03.producto.Producto;

public class Compra {

    //Atributos
    private Productos producto;
    private int cantidad;

    public Compra(Productos producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Productos getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }
    public double calcSubTotal(){
        return producto.getPrecio() * cantidad;
    }

    @Override
    public String toString() {
        return producto + "\t " + cantidad;
    }
}
