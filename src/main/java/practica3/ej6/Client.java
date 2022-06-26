package practica3.ej6;

public class Client {
    public static void main(String[] args){
        IDiagnosis fixer = new AppFixer();

        Celular celular = new Celular("AMD Ryzen", "7 inches", "Galaxy 9");
        TV tv = new TV("75", "Samsung 3", "2018");
        Computadora computadora = new Computadora("Core i9", "16 gb", "AMD 5500");

        celular.acceptDiagnosis(fixer);
        tv.acceptDiagnosis(fixer);
        computadora.acceptDiagnosis(fixer);
    }
}
