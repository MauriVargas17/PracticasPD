package practica2.ej2;

public class Teniente implements IMilitar{

    IMilitar next;

    @Override
    public void setNext(IMilitar militar) {
        next = militar;
    }

    @Override
    public void ejecutarOrden(Ordenes orden) {
        switch (orden){
            case Disciplina -> System.out.println("Teniente aplicando disciplina");
            default -> next().ejecutarOrden(orden);
        }
    }

    @Override
    public IMilitar next() {
        return next;
    }
}
