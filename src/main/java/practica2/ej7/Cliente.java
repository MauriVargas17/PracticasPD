package practica2.ej7;

public class Cliente {
    private String name;
    private boolean hasDocuments;

    public Cliente(String name) {

        this.name = name;
        this.hasDocuments = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasDocuments() {
        String txt;
        txt = hasDocuments ? name+" tiene sus documentos" : name+" no tiene sus documentos";
        System.out.println(txt);
        return hasDocuments;
    }

    public void setHasDocuments(boolean hasDocuments) {
        this.hasDocuments = hasDocuments;
    }
}
