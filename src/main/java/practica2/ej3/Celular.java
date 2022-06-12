package practica2.ej3;

public class Celular {
    private String modelo;
    private int precio;
    private int year;

    public Celular(String modelo, int precio, int year) {
        this.modelo = modelo;
        this.precio = precio;
        this.year = year;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
