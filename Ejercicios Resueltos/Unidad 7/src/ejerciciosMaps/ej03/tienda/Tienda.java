package ejerciciosMaps.ej03.tienda;
import ejerciciosMaps.ej03.producto.Producto;

import java.util.*;
//Productos de la tienda y su cantidad.

public class Tienda {

    private String nombre;
    private Map<Producto, Integer> stock;

    //Constructor
    public Tienda(String nombre) {
        this.nombre = nombre;
        this.stock = new TreeMap<>();
    }

    //getter
    public Map<Producto, Integer> getStock() {
        return stock;
    }

    //Métodes
    public void addProducto(Producto producto, int cantidad){
        Integer aux;
        if (stock.get(producto)==null){
            stock.put(producto,cantidad);
        }else{
            aux = stock.get(producto);
            stock.put(producto,(aux+cantidad));
        }
    }

    public void verStock(){
        Set<Map.Entry<Producto,Integer>> listaProductos = stock.entrySet();
        System.out.println(listaProductos);
    }


}
