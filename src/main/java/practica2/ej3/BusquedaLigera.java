package practica2.ej3;

import java.util.ArrayList;
import java.util.List;

public class BusquedaLigera implements IAlgoritmo{

    @Override
    public List<Celular> execute(Object criteria, Celular[] inventario) {
        System.out.println("Filtrando con busqueda ligera");
       if (criteria instanceof String){
           return buscar((String)criteria, inventario);
       } else if (criteria instanceof Integer){
           return buscar((int)criteria, inventario);
       } else if (criteria instanceof List){
           return buscar((List<Object>) criteria, inventario);
       } else {
           throw new IllegalArgumentException("No hay match de criteria");
       }
    }

    private List<Celular> buscar(String criteria, Celular[] inventario){
        List<Celular> filtrado = new ArrayList<>();
        for (Celular c: inventario){
            if (c.getModelo().equals(criteria)){
                filtrado.add(c);
            }
        }
        return filtrado;
    }

    private List<Celular> buscar(int criteria, Celular[] inventario){
        List<Celular> filtrado = new ArrayList<>();
        for (Celular c: inventario){
            if (c.getPrecio() == criteria){
                filtrado.add(c);
            }
        }
        return filtrado;
    }

    private List<Celular> buscar(List<Object> criteria, Celular[] inventario){
        List<Celular> filtrado = new ArrayList<>();
        String modelo = (String) criteria.get(0);
        int precio = (int) criteria.get(1);
        for (Celular c: inventario){
            if (c.getModelo().equals(modelo) && c.getPrecio() == precio){
                filtrado.add(c);
            }
        }
        return filtrado;
    }
}
