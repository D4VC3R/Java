package ejerciciosMaps.ej03.producto;

public class Producto implements Comparable {

    private String nombre;
    private String codigoBarras;

    public Producto(String nombre, String codigoBarras) {
        this.nombre = nombre;
        this.codigoBarras = codigoBarras;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    @Override
    public int compareTo(Object o) {
        Producto p = (Producto)o;
        return this.codigoBarras.compareTo(p.codigoBarras);
    }

    @Override
    public String toString() {
        return "Producto: " + nombre + " | Cantidad ";
    }
}
