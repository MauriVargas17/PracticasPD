package practica3.ej2;

public class Client {
    public static void main(String[] args){
        IPago banco = new TransferenciaBancaria();
        IPago tigoMoney = new TigoMoney();
        IPago app = new AplicacionEmpresa();
        IInstalacion alcantarillado = new InstalAlcantarilla(banco);
        IInstalacion aguas = new InstalAgua(tigoMoney);
        IInstalacion electricidad = new InstalElectrica(app);

        alcantarillado.receivePayment();
        aguas.receivePayment();
        electricidad.receivePayment();
    }
}
