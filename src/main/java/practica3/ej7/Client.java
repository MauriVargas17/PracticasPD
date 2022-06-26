package practica3.ej7;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args){
        List<User> empresa = new ArrayList<>();
        empresa.add(new Presidente("Boby"));
        empresa.add(new Vicepresidente("George"));
        empresa.add(new Contabilidad("Teresa"));
        Reparador reparador = new Reparador(empresa);

        Tablet tablet = new Tablet("SX 99", 4);
        PC pc = new PC("Core i7", 5);
        Laptop laptop = new Laptop("Core i5", 3);

        tablet.getRepaired(reparador);
        pc.getRepaired(reparador);
        laptop.getRepaired(reparador);


    }
}
