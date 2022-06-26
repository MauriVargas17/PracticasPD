package practica3.ej7;

public class Presidente implements User{
    private String name;

    public Presidente(String name) {
        this.name = name;
    }

    @Override
    public String getAutoridad() {
        return name;
    }

    @Override
    public void receiveNotification(String n) {
        System.out.println(name+" recibio: "+n);
    }
}
