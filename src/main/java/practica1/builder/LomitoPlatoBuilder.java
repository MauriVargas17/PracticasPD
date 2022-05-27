package practica1.builder;

public class LomitoPlatoBuilder extends PlatoBuilder{
    @Override
    public void chooseName() {
        plato.setName("Lomito");
    }

    @Override
    public void chooseTipoDeCarne() {
        plato.setTipoDeCarne("lomo");
    }

    @Override
    public void chooseSaborRefresco() {
        plato.setSaborRefresco("Pepsi");
    }

    @Override
    public void chooseGuarniciones() {
        plato.setGuarniciones("arroz");
    }
}
