package practicaXML.libreria;

import practicaXML.libro.Libro;

import java.io.Serializable;
import java.util.HashMap;

public class Libreria implements Serializable {
    HashMap<Libro,Integer> stock;

    public Libreria() {
        this.stock = new HashMap<>();
    }

    public HashMap<Libro, Integer> getStock() {
        return stock;
    }

    public void setStock(HashMap<Libro, Integer> stock) {
        this.stock = stock;
    }

    public void addLibro(Libro libro, int cantidad) {
        if (stock.containsKey(libro)) {
            stock.put(libro, stock.get(libro) + cantidad);
        } else {
            stock.put(libro, cantidad);
        }
    }

    @Override
    public String toString() {
        return "Stock: " + stock;
    }
}
