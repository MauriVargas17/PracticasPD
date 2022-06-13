package practica2.ej7;

public class Deuda {
    private static Deuda deuda;
    private static int balance;
    private static int valor;

    private Deuda(int valor){
        this.valor = valor;
        balance = 0;
    }

    public static void createDeuda(int amount) {
        if (deuda == null) {
            deuda = new Deuda(amount);
        }
    }

    public static int getBalance() {
        return balance;
    }

    public static void setBalance(int balance) {
        Deuda.balance = balance;
    }

    public static int getValor(){
        return valor;
    }
}
