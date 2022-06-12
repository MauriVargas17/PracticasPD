package practica2.ej5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Github{
    private Map<String,Memento> commits= new HashMap<>();


    public void createCommit(String commitFormat, Memento m){
        commits.put(commitFormat, m);
    }

    public Memento getCommit(String commitFormat){
        return commits.get(commitFormat);
    }


}
