package practica3.ej4;

public class Server2 implements IServer{
    private static final Server2 s2 = new Server2();

    private Server2 (){

    }

    public static Server2 getServer(){
        return s2;
    }

    @Override
    public void processUser(User user, WebApp webApp) {
        System.out.println(user.getName()+" was let in "+webApp.getName()+" through Server 2");
    }
}
