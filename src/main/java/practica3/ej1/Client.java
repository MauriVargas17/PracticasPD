package practica3.ej1;

public class Client {
    public static void main(String[] args){
        Personaje p1 = new Caballero("Orfelio", "Arrows");
        p1 = new AddingWeapon(p1, "Axe");
        p1 = new AddingShield(p1);
        p1 = new AddingResistance(p1);

        p1.applyModifier();
    }
}
