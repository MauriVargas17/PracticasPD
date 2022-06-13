package practica2.ej7;

public class Client {
    public static void main(String[] args){
        Cliente cliente = new Cliente("Eynar");
        Banco banco = new Banco();

        cliente.isHasDocuments();

        banco.giveDeuda(1000, cliente);

        banco.ejecutar(200, cliente);
        banco.ejecutar(200, cliente);
        banco.ejecutar(200, cliente);
        banco.ejecutar(200, cliente);
        banco.ejecutar(200, cliente);

        cliente.isHasDocuments();

        banco.ejecutar(200, cliente);


    }
}
