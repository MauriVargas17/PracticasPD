package practica1.builder;

public class TiraPlatoBuilder extends PlatoBuilder{
    @Override
    public void chooseName() {
        plato.setName("Tira");
    }

    @Override
    public void chooseTipoDeCarne() {
        plato.setTipoDeCarne("tira de carne");
    }

    @Override
    public void chooseSaborRefresco() {
        plato.setSaborRefresco("Coca Cola");
    }

    @Override
    public void chooseGuarniciones() {
        plato.setGuarniciones("fideos");
    }
}
