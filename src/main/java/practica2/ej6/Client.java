package practica2.ej6;

public class Client {
    public static void main(String[] args){
        SalaDeChat sala = new SalaDeChat();

        Dev d1 = new Dev("Bob", sala);
        Dev d2 = new Dev("Rick", sala);
        Dev d3 = new Dev("Martin", sala);
        Dev d4 = new Dev("Rodrigo", sala);

        sala.addDev(d1).addDev(d2).addDev(d3).addDev(d4);

        d1.send("Subiendo codigo a la carpeta src");
        d2.send("Subiendo la correccion a tu codigo", d3);



    }
}
