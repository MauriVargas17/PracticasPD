package practica2.ej7;

public interface ICobrador {
    void setNext(ICobrador cobrador);
    void ejecutar(int amount, Cliente c);
    ICobrador next();
}
