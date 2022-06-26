package practica3.ej6;

public class TV implements IArtefacto{

    private String inches;
    private String model;
    private String year;

    public TV(String inches, String model, String year) {
        this.inches = inches;
        this.model = model;
        this.year = year;
    }

    @Override
    public void acceptDiagnosis(IDiagnosis diagnosis) {
        diagnosis.diagnose(this);
    }

    @Override
    public void showAttributes() {
        System.out.println("TV");
        System.out.println("Inches: "+inches);
        System.out.println("Model: "+model);
        System.out.println("Year: "+year);
        System.out.println();
    }
}
