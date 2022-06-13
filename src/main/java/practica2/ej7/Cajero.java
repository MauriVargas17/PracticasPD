package practica2.ej7;

public class Cajero implements ICobrador{

    ICobrador next;

    @Override
    public void setNext(ICobrador cobrador) {
        next = cobrador;
    }

    @Override
    public void ejecutar(int amount, Cliente c) {
        if (Deuda.getBalance() < Deuda.getValor() * 0.25){
            Deuda.setBalance(Deuda.getBalance()+amount);
            System.out.println("El cajero hace el cobro de "+amount+" dejando un balance pagado de "+Deuda.getBalance());
        } else {
            next().ejecutar(amount, c);
        }
    }

    @Override
    public ICobrador next() {
        return next;
    }
}
