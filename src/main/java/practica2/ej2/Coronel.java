package practica2.ej2;

public class Coronel implements IMilitar{

    IMilitar next;

    @Override
    public void setNext(IMilitar militar) {
        next = militar;
    }

    @Override
    public void ejecutarOrden(Ordenes orden) {

        switch (orden){
            case Desbloqueos -> System.out.println("Coronel desbloqueando");
            case Manifestaciones -> System.out.println("Coronel actuando en manifestaciones");
            default -> next().ejecutarOrden(orden);
        }
    }

    @Override
    public IMilitar next() {
        return next;
    }

}
