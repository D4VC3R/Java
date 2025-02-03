package agenda;
import contactos.Contactos;
import java.util.ArrayList;
import java.util.List;

public class Agenda {

    List<Contactos> contactos;

    //Constructor
    public Agenda() {
        contactos = new ArrayList<>();
    }

    //Metodos
    public boolean addContacto (Contactos c){
        if (!isEnAgenda(c)){
            if (contactos.add(c));
            return true;
        }else
            return false;
    }
    
    public boolean removeContacto (Contactos c){
         if (isEnAgenda(c)){
             contactos.remove(c);
             return true;
         }else
             return false;
    }
    public boolean isEnAgenda(Contactos c){
        return contactos.contains(c);
    }
}
