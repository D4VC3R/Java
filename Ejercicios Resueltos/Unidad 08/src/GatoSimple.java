public class GatoSimple {


    //Atributos

    String color;
    String raza;
    String sexo;
    byte edad;
    double peso;

    //Constructor

    GatoSimple(){
        color = "Naranja";
        raza = "Siamés";
        sexo = "Hembra";
        edad = 7;
        peso = 5.6;
    }

    //Métodos

    public void maullar(){
        System.out.println("¡Miau!");
    }

    public void ronronear(){
        System.out.println("Purrrrr");
    }

    public double comer(){
        System.out.println("El gato ha comido.");
        return this.peso += 0.1;
    }

    public void pelear(GatoSimple otroGato){
        if ((this.sexo.equalsIgnoreCase("Macho") || this.sexo.equalsIgnoreCase("Hermafrodita"))
        && (otroGato.sexo.equalsIgnoreCase("Macho") || otroGato.sexo.equalsIgnoreCase("Hermafrodita")))
            System.out.println("Los gatos se están peleando.");
        else
            System.out.println("Los gatos se llevan bien.");
    }
    public void peso(){
        System.out.println("El gato pesa "+peso+"Kg.");
    }
}
