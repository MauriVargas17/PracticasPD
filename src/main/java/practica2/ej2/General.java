package practica2.ej2;

public class General implements IMilitar{

    IMilitar next;

    @Override
    public void setNext(IMilitar militar) {
        next = militar;
    }

    @Override
    public void ejecutarOrden(Ordenes orden) {
       Teniente teniente = new Teniente();
       setNext(teniente);

       Coronel coronel = new Coronel();
       teniente.setNext(coronel);

       Cabo cabo = new Cabo();
       coronel.setNext(cabo);

        switch (orden){
            case Entrevistas -> System.out.println("General entrevistando");
            default -> next().ejecutarOrden(orden);
        }
    }

    @Override
    public IMilitar next() {
        return next;
    }
}
