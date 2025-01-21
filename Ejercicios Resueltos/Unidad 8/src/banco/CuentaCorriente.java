package banco;

public class CuentaCorriente {

    //Atributos
    private int saldo = 0;
    private int limiteDescubierto = -50;
    private String nombre;
    private String dni;

    //Constructor
    public CuentaCorriente(String nombre, String dni) {
        setNombre(nombre);
        setDNI(dni);
    }


    //Métodos
    public boolean sacarDinero(int dinero){
        if (getSaldo()-dinero >=getLimiteDescubierto()){
            if (getSaldo()-dinero<0){

            }
        }
    }


    public void ingresarDinero(int dinero){
        saldo += dinero;
    }
    public int getSaldo(){
        return saldo;
    }
    public int getLimiteDescubierto(){
        return limiteDescubierto;
    }
    public void mostrarInfo(){
        System.out.print("Nombre: "+nombre+"\nSaldo: "+saldo+"\n" +
                "Límite descubierto: "+limiteDescubierto);
    }

    private void setNombre(String nombre){
        this.nombre = nombre;
    }
    private void setDNI(String dni) {
        this.dni = dni;
    }
    private void setLimiteDescubierto(int saldo, int dinero){
        limiteDescubierto += saldo-dinero;
    }

}
