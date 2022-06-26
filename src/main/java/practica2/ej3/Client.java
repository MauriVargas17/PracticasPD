package practica2.ej3;

public class Client {
    public static void main(String[] args){
        Tienda tienda = new Tienda(null);
        Celular c1 = new Celular("s10", 350, 2020);
        Celular c2 = new Celular("SE", 456, 2021);
        Celular c3 = new Celular("note 10", 570, 2021);
        Celular c4 = new Celular("note 5", 733, 2014);
        Celular c5 = new Celular("X pro max", 900, 2019);
        Celular c6 = new Celular("SE", 342, 2022);
        Celular c7 = new Celular("iPhone 8", 875, 2018);
        Celular c8 = new Celular("Galaxy Note 3", 766, 2017);
        Celular c9 = new Celular("s21", 733, 2022);
        Celular c10 = new Celular("Huawei s40", 489, 2015);

        Celular[] inventario1 = {c1,c2,c3,c4,c5,c6};
        Celular[] inventario2 = {c1,c2,c3,c4,c5,c6,c7,c8,c9,c10};

        tienda.setInventario(inventario1);
        tienda.buscarCelular(733);

        tienda.setInventario(inventario2);
        tienda.buscarCelular("X pro max");

        tienda.buscarCelular("SE", 456);


    }
}
