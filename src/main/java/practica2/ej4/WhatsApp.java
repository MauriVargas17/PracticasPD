package practica2.ej4;

import java.util.ArrayList;
import java.util.List;

public class WhatsApp implements ICanal{

    List<Persona> users = new ArrayList<>();

    public WhatsApp addUser(Persona persona){
        users.add(persona);
        return this;
    }

    @Override
    public void send(String msg, Persona sender, Persona receiver) {
        if (receiver == null){
            iterateUsers(msg, sender);
        } else {
            receiver.receive(msg, sender);
        }
    }

    private void iterateUsers(String s, Persona sender){
        for (Persona p: users){
            if (p != sender){
                p.receive(s, sender);
            }
        }
    }
}
