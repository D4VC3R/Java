public class GatoSimple {

    //Atributos

    String color;
    String raza;
    String sexo;
    byte edad;
    double peso;

    //Métodos

    public void maullar(){
        System.out.println("¡Miau!");
    }

    public void ronronear(){
        System.out.println("Purrrrr");
    }

    public double comer(){
        return this.peso += 0.1;
    }

    public void pelear(GatoSimple otroGato){
        if (this.sexo.equalsIgnoreCase("Macho")&& otroGato.sexo.equalsIgnoreCase("Macho")
        || this.sexo.equalsIgnoreCase("Hembra") && otroGato.sexo.equalsIgnoreCase("Hembra"))
            System.out.println("Los gatos se están peleando.");
        else
            System.out.println("Los gatos se llevan bien.");
    }

    //Metodo Main

    public static void main(String[] args) {

        GatoSimple gato1 = new GatoSimple();
        GatoSimple gato2 = new GatoSimple();

        gato1.color="Naranja";
        gato1.raza="Siamés";
        gato1.sexo="Macho";
        gato1.edad=5;
        gato1.peso=8.6;

        gato2.color="Negro";
        gato2.raza="Persa";
        gato2.sexo="Macho";
        gato2.edad=6;
        gato2.peso=7.9;

        gato1.maullar();
        gato2.ronronear();
        gato1.pelear(gato2);
    }
}
