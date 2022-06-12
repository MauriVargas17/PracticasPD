package practica2.ej4;

public class Client {
    public static void main(String[] args){
        WhatsApp whatsApp = new WhatsApp();

        Persona p1 = new Persona("Bob",whatsApp);
        Persona p2 = new Persona("Lenny",whatsApp);
        Persona p3 = new Persona("Shaun",whatsApp);
        Persona p4 = new Persona("Fer",whatsApp);
        Persona p5 = new Persona("Pedro",whatsApp);
        Persona p6 = new Persona("Carl",whatsApp);
        Persona p7 = new Persona("Oscar",whatsApp);
        Persona p8 = new Persona("Waldo",whatsApp);
        Persona p9 = new Persona("Aaron",whatsApp);
        Persona p10 = new Persona("Emily",whatsApp);

        whatsApp.addUser(p1).addUser(p2).addUser(p3).addUser(p4).addUser(p5).addUser(p6).addUser(p7).addUser(p8).addUser(p9).addUser(p10);

        p1.send("Hola cuate", p2);
        p10.send("Hola a todos");
    }
}
