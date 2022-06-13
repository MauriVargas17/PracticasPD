package practica2.ej7;

public class EncargadoDePrestamos implements ICobrador{

    ICobrador next;

    @Override
    public void setNext(ICobrador cobrador) {
        next = cobrador;
    }

    @Override
    public void ejecutar(int amount, Cliente c) {
        if (Deuda.getBalance() ==  Deuda.getValor()){
            System.out.println("Gracias por terminar de pagar, aqui van sus documentos");
            c.setHasDocuments(true);
        }
    }

    @Override
    public ICobrador next() {
        return next;
    }
}
