package ejerciciosMaps.ej03;

import ejerciciosMaps.ej03.producto.Producto;
import ejerciciosMaps.ej03.tienda.Tienda;

public class Ej03 {
    public static void main(String[] args) {

        Tienda t = new Tienda("Mercahome");

        t.addProducto(new Producto("Patatas","1A"), 20);
        t.verStock();
        t.addProducto(new Producto("Cebollas","2A"), 10);
        t.verStock();
        t.addProducto(new Producto("Patatas","1A"),5);
        t.verStock();
        System.out.println(t.getStock());


    }
}
