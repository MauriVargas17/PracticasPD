package practica2.ej6;

import java.util.ArrayList;
import java.util.List;

public class SalaDeChat implements IChat{

    List<Dev> devs = new ArrayList<>();

    public SalaDeChat addDev(Dev dev) {
        devs.add(dev);
        return this;
    }

    @Override
    public void send(String msg, Dev sender, Dev receiver) {
        if (receiver == null){
            iterateUsers(msg, sender);
        } else {
            receiver.receive(msg, sender);
        }
    }

    private void iterateUsers(String s, Dev sender){
        for (Dev d: devs){
            d.receive(s, sender);
        }
    }
}
