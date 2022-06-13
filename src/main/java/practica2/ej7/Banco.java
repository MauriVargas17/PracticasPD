package practica2.ej7;

public class Banco implements ICobrador{

    ICobrador next;
    boolean deudaExists = false;

    @Override
    public void setNext(ICobrador cobrador) {
        next = cobrador;
    }

    public void giveDeuda(int amount, Cliente c) {
        System.out.println("Dando deuda al sr. "+c.getName());
        Deuda.createDeuda(amount);
        deudaExists = true;
        c.setHasDocuments(false);
    }

    @Override
    public void ejecutar(int amount, Cliente c) {

        if(deudaExists){
            Cajero cajero = new Cajero();
            setNext(cajero);

            AgenteDeCredito agente = new AgenteDeCredito();
            cajero.setNext(agente);

            Supervisor supervisor = new Supervisor();
            agente.setNext(supervisor);

            EncargadoDePrestamos encargado = new EncargadoDePrestamos();
            supervisor.setNext(encargado);

            System.out.println("Cobrando deuda");
            next().ejecutar(amount, c);
        } else {
            throw new NullPointerException("Ninguna deuda fue contraida aun");
        }
    }

    @Override
    public ICobrador next() {
        return next;
    }
}
