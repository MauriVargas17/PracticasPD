package practica3.ej7;

import java.util.ArrayList;
import java.util.List;

public class Reparador implements IReparador{

    private Cuenta cuenta = Cuenta.getCuenta();
    private List<User> users = new ArrayList<>();

    public Reparador(List<User> users) {
        this.users = users;
    }

    private void notificador(String s){
        System.out.println("Notificando a autoridades");
        for (User u: users){
            notifyUser(u, s);
        }
    }

    @Override
    public void reparar(Laptop laptop) {
        System.out.println("Reparando laptop "+laptop.getModel());
        System.out.println("Se cobra un costo de: "+150*laptop.getSize());
        cuenta.recibirPago(150*laptop.getSize());
        notificador("Se hizo un pago por reparacion");
    }

    @Override
    public void reparar(PC pc) {
        System.out.println("Reparando pc "+pc.getModel());
        System.out.println("Se cobra un costo de: "+200*pc.getSize());
        cuenta.recibirPago(200*pc.getSize());
        notificador("Se hizo un pago por reparacion");
    }

    @Override
    public void reparar(Tablet tablet) {
        System.out.println("Reparando tablet "+tablet.getModel());
        System.out.println("Se cobra un costo de: "+100*tablet.getSize());
        cuenta.recibirPago(100*tablet.getSize());
        notificador("Se hizo un pago por reparacion");
    }

    @Override
    public void add(User user) {
        users.add(user);
    }

    @Override
    public void remove(User user) {
        users.remove(user);
    }

    @Override
    public void notifyUser(User user, String s) {
        user.receiveNotification(s);
    }
}
