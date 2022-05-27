package practica1.builder;

public class BifePlatoBuilder extends PlatoBuilder{
    @Override
    public void chooseName() {
        plato.setName("Bife");
    }

    @Override
    public void chooseTipoDeCarne() {
        plato.setTipoDeCarne("bife");
    }

    @Override
    public void chooseSaborRefresco() {
        plato.setSaborRefresco("Coca Cola");
    }

    @Override
    public void chooseGuarniciones() {
        plato.setGuarniciones("papas fritas");
    }
}
