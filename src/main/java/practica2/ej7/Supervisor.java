package practica2.ej7;

public class Supervisor implements ICobrador{

    ICobrador next;

    @Override
    public void setNext(ICobrador cobrador) {
        next = cobrador;
    }

    @Override
    public void ejecutar(int amount, Cliente c) {
        if ((Deuda.getBalance() > Deuda.getValor() * 0.5) && (Deuda.getBalance() != Deuda.getValor())){
            Deuda.setBalance(Deuda.getBalance()+amount);
            System.out.println("El supervisor hace el cobro de "+amount+" dejando un balance pagado de "+Deuda.getBalance());
            System.out.println("Se ofrece un nuevo prestamo al cliente!");
        } else {
            next().ejecutar(amount, c);
        }

        if(Deuda.getBalance() == Deuda.getValor()){
            next().ejecutar(amount, c);
        }
    }

    @Override
    public ICobrador next() {
        return next;
    }
}
