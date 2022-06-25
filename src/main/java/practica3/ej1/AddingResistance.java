package practica3.ej1;

public class AddingResistance extends Modifier{

    public AddingResistance(Personaje personaje) {
        super(personaje);
    }

    @Override
    public void applyModifier() {
        System.out.println("New potion aquired!");
        System.out.println("Increasing in 80% the regeneration points of "+personaje.getName());
        personaje.setRegPoints(personaje.getRegPoints() * 1.8);
        personaje.applyModifier();
    }
}
