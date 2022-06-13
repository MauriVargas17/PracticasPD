package practica2.ej7;

public class AgenteDeCredito implements ICobrador{

    ICobrador next;

    @Override
    public void setNext(ICobrador cobrador) {
        next = cobrador;
    }

    @Override
    public void ejecutar(int amount, Cliente c) {
        if ((Deuda.getBalance() >= Deuda.getValor() * 0.25) && (Deuda.getBalance() <= Deuda.getValor() * 0.5)){
            Deuda.setBalance(Deuda.getBalance()+amount);
            System.out.println("El agente de credito hace el cobro de "+amount+" dejando un balance pagado de "+Deuda.getBalance());
            System.out.println("Se ofrece un refinanciamiento del credito!");
        } else {
            next().ejecutar(amount, c);
        }
    }

    @Override
    public ICobrador next() {
        return next;
    }
}
