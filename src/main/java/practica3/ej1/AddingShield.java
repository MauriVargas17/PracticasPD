package practica3.ej1;

public class AddingShield extends Modifier{


    public AddingShield(Personaje personaje) {
        super(personaje);
    }

    @Override
    public void applyModifier() {
        System.out.println("New shield obtained!");
        System.out.println("Increasing in 35% the defence points of "+personaje.getName());
        personaje.setDefencePoints(personaje.getDefencePoints() * 1.35);
        System.out.println("Increasing in 10% the armor resistance");
        personaje.setArmorPct(personaje.getArmorPct() * 1.1);
        personaje.applyModifier();
    }
}
