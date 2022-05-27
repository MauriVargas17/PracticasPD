package practica1.builder;

public abstract class PlatoBuilder {
    protected Plato plato;

    public void createPlato(){
        plato = new Plato();
    }

    public Plato getPlato() {
        return plato;
    }

    public abstract void chooseName();
    public abstract void chooseTipoDeCarne();
    public abstract void chooseSaborRefresco();
    public abstract void chooseGuarniciones();

}
