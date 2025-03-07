package prueba;
import banco.Clientes;
import java.util.HashSet;
import java.util.Set;

public class PruebaCuentas{
    public static void main(String[] args) {

        Clientes cl1 = new Clientes("Antonio","00001",2000);
        Clientes cl2 = new Clientes("Maria","00002",2400);
        Clientes cl3 = new Clientes("Pascual","00003",290);
        Clientes cl4 = new Clientes("Pancho","00004",1400);
        Clientes cl5 = new Clientes("Pancho","00004",1400);

        Set<Clientes> clientesBanco=new HashSet<Clientes>();

        clientesBanco.add(cl1);
        clientesBanco.add(cl2);
        clientesBanco.add(cl3);
        clientesBanco.add(cl4);
        clientesBanco.add(cl5);

        for(Clientes clientes: clientesBanco){
            System.out.println(clientes.getNombre()+ " "+
                    clientes.getnCuenta()+ " "+clientes.getSaldo());
        }
    }
}
