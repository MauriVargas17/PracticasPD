package practica2.ej5;

public class RecuperarCommit implements Notification{

    private String msg = "Se recupero el commit ";


    @Override
    public String getMsg() {
        return msg;
    }
}
