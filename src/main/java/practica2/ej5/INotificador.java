package practica2.ej5;

public interface INotificador {
    void add(Programmer p);
    void remove(Programmer p);
    void notifyProgrammer(Notification n, String id);
}
