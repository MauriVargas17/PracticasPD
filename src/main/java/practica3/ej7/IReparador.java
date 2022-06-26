package practica3.ej7;

public interface IReparador {
    void reparar(Laptop laptop);
    void reparar(PC pc);
    void reparar(Tablet tablet);

    void add(User user);
    void remove(User user);
    void notifyUser(User user, String s);
}
