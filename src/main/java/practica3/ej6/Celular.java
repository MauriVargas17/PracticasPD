package practica3.ej6;

public class Celular implements IArtefacto{

    private String cpu;
    private String screen;
    private String model;

    public Celular(String cpu, String screen, String model) {
        this.cpu = cpu;
        this.screen = screen;
        this.model = model;
    }

    @Override
    public void acceptDiagnosis(IDiagnosis diagnosis) {
        diagnosis.diagnose(this);
    }

    @Override
    public void showAttributes() {
        System.out.println("Celular");
        System.out.println("CPU: "+cpu);
        System.out.println("Screen: "+screen);
        System.out.println("Model: "+model);
        System.out.println();
    }
}
