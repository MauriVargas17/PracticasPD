package practica3.ej7;

public class Vicepresidente implements User{
    private String name;

    public Vicepresidente(String name) {
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
