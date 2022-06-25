package practica3.ej1;

public class AddingWeapon extends Modifier{

    private String weapon;

    public AddingWeapon(Personaje personaje, String weapon) {
        super(personaje);
        this.weapon = weapon;
    }

    @Override
    public void applyModifier() {
        System.out.println("New weapon obtained!");
        System.out.println(weapon);
        personaje.setWeapons(weapon);
        System.out.println("Increasing in 30% the attack points of "+personaje.getName());
        personaje.setAttackPoints(personaje.getAttackPoints() * 1.3);
        double newLevel = personaje.getLevel() * 2;
        personaje.setLevel(newLevel);
        System.out.println("Doubling the level to: "+newLevel);
        personaje.applyModifier();
    }
}
