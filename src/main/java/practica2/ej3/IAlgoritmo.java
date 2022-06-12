package practica2.ej3;

import java.util.List;

public interface IAlgoritmo {
    List<Celular> execute(Object criteria, Celular[] inventario);
}
