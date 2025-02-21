package agendas;
import contacto.Contacto;
import excepciones.EdadNegativaException;

import java.util.*;

public class Agenda {
    private String nombre;
    private List<Contacto> contactos;

    public Agenda(String nombre) {
        this.nombre = nombre;
        this.contactos = new ArrayList<>();
    }

    public String getSexo(int i){
        String sexo = "";
        switch(i){
            case 1: sexo = "Hombre";
            break;
            case 2: sexo = "Mujer";
            break;
        }
        return sexo;
    }

    private Contacto solicitarDatos(){
        Scanner sc = new Scanner(System.in);
        String nombre, sexo, telefono, direccion;
        int edad=0;


        imprimirPantalla("Nombre: ");
        nombre = sc.nextLine();

        do {
            imprimirPantalla("Edad: ");
            try{
                edad = sc.nextInt();
                if (edad<=0)
                    throw new EdadNegativaException();
            }catch (EdadNegativaException ene){
                imprimirPantalla(ene.getMessage());
            }
        }while(edad<=0);

        imprimirPantalla("Sexo: \n1.- Hombre\n2.- Mujer\n");
        sexo = getSexo(sc.nextInt());
        sc.nextLine(); //Buidar el búfer per a evitar problemes

        imprimirPantalla("Teléfono: ");
        telefono = sc.nextLine();

        imprimirPantalla("Dirección: ");
        direccion = sc.nextLine();

        return new Contacto(nombre, sexo, telefono, direccion, edad);
    }

    public void imprimirPantalla(String s) {
        System.out.print(s);
    }

    public void addContacto(Agenda a){

        if (a.contactos.size()<3){
            Contacto c=solicitarDatos();
            a.contactos.add(c);
        }else
            imprimirPantalla("Límite de contactos alcanzado en esta agenda.\n");
    }
    public void mostrarContactos(Agenda a){
        if (contactos.isEmpty())
            System.out.println(a.toString()+"Agenda vacía.\n");
        else{
            System.out.println(a.toString());
            for (Contacto c:a.contactos) {
                imprimirPantalla((a.contactos.indexOf(c) + 1) + ".- " + c.toString());
            }
        }
    }


    public void eliminarContacto(Agenda a){
        Scanner sc = new Scanner(System.in);

        if (!contactos.isEmpty()){
            mostrarContactos(a);
            imprimirPantalla("Número de contacto a eliminar: ");
            contactos.remove(sc.nextInt()-1);
        }else
            mostrarContactos(a);
    }

    @Override
    public String toString() {
        return "==============================================" +
                "\n|| \t\tCONTACTOS - AGENDA " + nombre.toUpperCase()+" \t\t||\n"+
                "----------------------------------------------\n"+
                "Nombre\tSexo\tEdad\tTeléfono\tDirección\n"+
                "----------------------------------------------\n";

    }

    public void mostrarTodo(Agenda v, Agenda m, Agenda h) {
        mostrarContactos(v);
        mostrarContactos(m);
        mostrarContactos(h);

    }
}
