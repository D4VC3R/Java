package ejercicios.ej213;

import java.util.*;

public class Tienda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Productos> prodTienda = new HashMap<>();
        List<Compra> carrito = new ArrayList<>();
        String nomProd;
        int cantidad;
        boolean seguir = true;
        double totalCompra = 0.0;

        prodTienda.put("avena", new Productos("avena", 2.21));
        prodTienda.put("garbanzos", new Productos("garbanzos", 2.39));
        prodTienda.put("tomate", new Productos("tomate", 1.59));
        prodTienda.put("jengibre", new Productos("jengibre", 3.13));
        prodTienda.put("quinoa", new Productos("quinoa", 4.50));
        prodTienda.put("guisantes", new Productos("guisantes", 1.60));

        while(seguir){
            System.out.print("Producto: ");
            nomProd = sc.next().toLowerCase();

            if (nomProd.equalsIgnoreCase("fin")) {
                seguir = false;
            }else{
                System.out.print("Cantidad: ");
                cantidad = sc.nextInt();
                carrito.add(new Compra(prodTienda.get(nomProd), cantidad));
            }

        }
        //Total de la compra
        System.out.println("Producto\tPrecio\tCantidad\tSubtotal");
        System.out.println("--------------------------------------");
        for (Compra c: carrito){
            System.out.println(c.toString() + "\t\t" + c.calcSubTotal());
            totalCompra += c.calcSubTotal();
        }
        System.out.println("\nTotal: "+totalCompra+"€.");

    }
}
