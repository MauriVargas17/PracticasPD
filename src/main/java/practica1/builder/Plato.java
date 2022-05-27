package practica1.builder;

public class Plato {
    private String name;
    private String tipoDeCarne;
    private String saborRefresco;
    private String guarniciones;

    public void showPlato(){
        System.out.println("Este plato es "+name);
        System.out.println("El tipo de carne es: "+tipoDeCarne);
        System.out.println("El sabor de refresco es: "+saborRefresco);
        System.out.println("Las guarniciones son: "+guarniciones);
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTipoDeCarne() {
        return tipoDeCarne;
    }

    public void setTipoDeCarne(String tipoDeCarne) {
        this.tipoDeCarne = tipoDeCarne;
    }

    public String getSaborRefresco() {
        return saborRefresco;
    }

    public void setSaborRefresco(String saborRefresco) {
        this.saborRefresco = saborRefresco;
    }

    public String getGuarniciones() {
        return guarniciones;
    }

    public void setGuarniciones(String guarniciones) {
        this.guarniciones = guarniciones;
    }
}
