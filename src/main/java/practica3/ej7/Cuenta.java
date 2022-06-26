package practica3.ej7;

public class Cuenta {
    private static final Cuenta cuenta = new Cuenta();
    private static int balance = 0;

    private Cuenta(){

    }

    public void recibirPago(int amount){
        balance += amount;
    }

    public static Cuenta getCuenta(){
        return cuenta;
    }

}
