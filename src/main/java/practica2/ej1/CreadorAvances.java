package practica2.ej1;

public class CreadorAvances {
    private AvanceTesis avance;

    public void setAvance(AvanceTesis avance) {
        this.avance = avance;
    }

    public Memento crearAvance(){
        return new Memento(avance);
    }

    public AvanceTesis restaurarAvance(Memento m){
        System.out.println("-> Restaurando avance");
        avance = m.getAvance();
        return avance;
    }

}
