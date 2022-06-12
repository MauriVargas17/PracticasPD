package practica2.ej1;

import java.util.ArrayList;
import java.util.List;

public class RevisionesTutor {
    private List<Memento> versions = new ArrayList<>();

    public void revisarAvance(Memento m){
        versions.add(m);
    }

    public Memento obtenerAvance(int index){
        return versions.get(index);
    }

}
