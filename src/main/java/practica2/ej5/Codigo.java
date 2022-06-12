package practica2.ej5;

public class Codigo {
    private String texto;

    public Codigo(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void showCodigo(){
        System.out.println("El codigo actual es: "+texto);
    }
}
