package practica2.ej5;

import java.util.ArrayList;
import java.util.List;

public class Git implements INotificador{
    private Codigo state;
    private List<Programmer> subs = new ArrayList<>();

    public List<Programmer> getSubs() {
        return subs;
    }

    public void setCommit(Codigo state){
        this.state = state;
    }

    public Memento createCommit(){
        return new Memento(state);
    }

    public Codigo restoreCommit(Memento m, String id){
        System.out.println("Restaurando commit");
        Notification n = new RecuperarCommit();
        notifyProgrammer(n, id);
        this.state= m.getState();
        return this.state;
    }

    @Override
    public void add(Programmer p) {
        subs.add(p);
    }

    @Override
    public void remove(Programmer p) {
        subs.remove(p);
    }

    @Override
    public void notifyProgrammer(Notification n, String id) {
        for (Programmer p: subs){
            System.out.println(p.getName()+" fue notificado de: "+n.getMsg()+id);
        }

    }
}
