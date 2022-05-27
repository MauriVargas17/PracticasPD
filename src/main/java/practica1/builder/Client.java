package practica1.builder;

public class Client {
    public static void main(String[] args){
        Restaurante restaurante = new Restaurante();
        PlatoBuilder platoBuilder = new BifePlatoBuilder();
        restaurante.setPlatoBuilder(platoBuilder);

        restaurante.servePlato();
        platoBuilder.plato.showPlato();
    }
}
