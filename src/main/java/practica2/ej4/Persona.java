package practica2.ej4;

public class Persona {
    private String name;
    private ICanal canal;

    public Persona(String name, ICanal canal) {
        this.name = name;
        this.canal = canal;
    }

    public ICanal getCanal() {
        return canal;
    }

    public void setCanal(ICanal canal) {
        this.canal = canal;
    }

    public void send(String msg){
        canal.send(msg, this, null);
    }

    public void send(String msg, Persona receptor){
        canal.send(msg, this, receptor);
    }

    public void receive(String msg, Persona sender){
        System.out.println(name+" received: "+msg+" from: "+sender.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
