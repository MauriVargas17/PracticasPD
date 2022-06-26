package practica3.ej7;

public class PC implements IDispositivo{

    private String model;
    private int size;

    public PC(String model, int size) {
        this.model = model;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    @Override
    public void getRepaired(IReparador reparador) {
        reparador.reparar(this);
    }
}
