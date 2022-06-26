package practica3.ej6;

import java.util.Random;

public class AppFixer implements IDiagnosis{

    @Override
    public void diagnose(Celular celular) {
        System.out.println("Se debe hacer un tratamiento preventivo");
        celular.showAttributes();
    }

    @Override
    public void diagnose(Computadora computadora) {
        int n = new Random().nextInt(100);
        if(n % 2 == 0){
            System.out.println("Se debe hacer tratamiento preventivo a la computadora");
        } else {
            System.out.println("Se debe hacer tratamiento correctivo a la computadora");
        }
    }

    @Override
    public void diagnose(TV tv) {
        tv.showAttributes();
    }
}
