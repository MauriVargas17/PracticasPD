package practica3.ej4;

public class Server1 implements IServer{
    private static final Server1 s1 = new Server1();

    private Server1 (){

    }

    public static Server1 getServer(){
        return s1;
    }

    @Override
    public void processUser(User user, WebApp webApp) {
        System.out.println(user.getName()+" was let in "+webApp.getName()+" through Server 1");
    }
}
