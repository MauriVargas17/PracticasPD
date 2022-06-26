package practica3.ej4;

import java.util.ArrayList;
import java.util.List;

public class Proxy implements IServer{
    private SuperList users = new SuperList(new ArrayList<>());
    private WebApp app;
    private Server1 s1 = Server1.getServer();
    private Server2 s2 = Server2.getServer();

    public Proxy(List<User> users, WebApp webApp) {
        this.users.list = users;
        app = webApp;
    }

    public void letUsersThrough(List<User> requests){
        for (int i = 0; i < requests.size(); i++){
            if (users.includes(requests.get(i))){
                if (i % 2 == 0){
                    s2.processUser(requests.get(i), app);
                } else {
                    s1.processUser(requests.get(i), app);
                }
            }
        }
    }

    @Override
    public void processUser(User user, WebApp webApp) {

    }
}
