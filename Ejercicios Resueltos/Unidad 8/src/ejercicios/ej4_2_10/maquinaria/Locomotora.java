package ejercicios.ej4_2_10.maquinaria;

import ejercicios.ej4_2_10.personal.Mecanico;

public class Locomotora {

    private final String matricula;
    private final int potencia;
    private final int anyoFabric;
    private Mecanico mecanico;

    public Locomotora(String matricula, int potencia, int anyoFabric) {
        this.matricula = matricula;
        this.potencia = potencia;
        this.anyoFabric = anyoFabric;
    }
    public void AsignarMecanico(Mecanico m){
        this.mecanico = m;
    }

    @Override
    public String toString() {
        return "------------------------\n|\t\tLocomotora\t\t|\n------------------------\n" +
                "Matricula: " + matricula +
                "\nPotencia: " + potencia + "HP" +
                "\nFabricada en " + anyoFabric +
                "\nMecanico asignado: " + mecanico.getNombre() +mecanico;
    }
}
