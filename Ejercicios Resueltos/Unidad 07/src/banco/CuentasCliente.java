package banco;

import java.util.Formattable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CuentasCliente {

    public static void main(String[] args) {

        Cliente cl1 = new Cliente("David","00001",2000);
        Cliente cl2 = new Cliente("Antonio","00002",200);
        Cliente cl3 = new Cliente("Maria","00003",1200);
        Cliente cl4 = new Cliente("Pancho","00004",2900);
        Cliente cl5 = new Cliente("David","00001",2000);

        Set <Cliente> clientes = new HashSet<>();

        clientes.add(cl1);
        clientes.add(cl2);
        clientes.add(cl3);
        clientes.add(cl4);
        clientes.add(cl5);

        for (Cliente c:clientes){
            System.out.println(c.getNombre()+" "+ c.getNumCuenta()+" " +c.getSaldo());

        }

        /*
        Iterator<Cliente> it = clientes.iterator();
            while(it.hasNext()){
                String nombreCliente=it.next().getNombre();
                System.out.println(nombreCliente); */

    }
}
