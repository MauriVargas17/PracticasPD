package practica3.ej6;

public class Computadora implements IArtefacto{

    private String cpu;
    private String ram;
    private String gpu;

    public Computadora(String cpu, String ram, String gpu) {
        this.cpu = cpu;
        this.ram = ram;
        this.gpu = gpu;
    }

    @Override
    public void acceptDiagnosis(IDiagnosis diagnosis) {
        diagnosis.diagnose(this);
    }

    @Override
    public void showAttributes() {

    }
}
