package practica1.singleton;

public class Estudiante {

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void pagar(Cajero c){
        c.receiveMoney(100);
    }
}
