package practica2.ej1;

public class Memento {
    private AvanceTesis avance;

    public Memento(AvanceTesis avance) {
        this.avance = avance;
    }

    public AvanceTesis getAvance() {
        return avance;
    }
}