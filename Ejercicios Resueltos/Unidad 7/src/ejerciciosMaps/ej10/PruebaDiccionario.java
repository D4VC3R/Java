package ejerciciosMaps.ej10;

public class PruebaDiccionario {
    public static void main(String[] args) {

        Diccionario d1 = new Diccionario();
        boolean seguir = true;
        String palabra;

        d1.addTraduccion("Gato","Cat");
        d1.addTraduccion("Perro","Dog");
        d1.addTraduccion("Suelo","Floor");
        d1.addTraduccion("Techo","Ceiling");
        d1.addTraduccion("Hola","Hello");

        System.out.println("Diccionario ESP/ING (introduce 'q' para salir.)");
        do {
            palabra = d1.getPalabra();
            if (palabra.equalsIgnoreCase("q"))
                seguir=false;
            else if (d1.getDiccionario().containsKey(palabra))
                System.out.println("Inglés: "+d1.getTraduccion(palabra));
            else
                System.out.println("La palabra no se encuentra en el diccionario.");
        }while(seguir);
    }
}
