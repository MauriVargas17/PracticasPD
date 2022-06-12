package practica2.ej2;

public class Cabo implements IMilitar{

    IMilitar next;

    @Override
    public void setNext(IMilitar militar) {
        next = militar;
    }

    @Override
    public void ejecutarOrden(Ordenes orden) {
        System.out.println("Cabo limpiando :(");
    }

    @Override
    public IMilitar next() {
        return next;
    }
}
