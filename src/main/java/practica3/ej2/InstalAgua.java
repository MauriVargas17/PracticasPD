package practica3.ej2;

public class InstalAgua implements IInstalacion{

    private double price = 109;
    private IPago metodoPago;

    public InstalAgua(IPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    private void work() {
        System.out.println("Realizando instalacion de agua");
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void receivePayment() {
        work();
        metodoPago.receivePayment(price);
    }
}

