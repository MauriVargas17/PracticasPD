package practica2.ej2;

public interface IMilitar {
    void setNext(IMilitar militar);
    void ejecutarOrden(Ordenes orden);
    IMilitar next();
}
