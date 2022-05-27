package practica1.builder;

public class Restaurante {
    private PlatoBuilder platoBuilder;

    public void setPlatoBuilder(PlatoBuilder platoBuilder) {
        this.platoBuilder = platoBuilder;
    }

    public void servePlato(){
        platoBuilder.createPlato();
        platoBuilder.chooseTipoDeCarne();
        platoBuilder.chooseSaborRefresco();
        platoBuilder.chooseGuarniciones();
        platoBuilder.chooseName();
    }
}
