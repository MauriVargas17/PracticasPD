package practica1.abstractFactory;

public class Reception {
    public static void main(String[] args){
        Math s1 = (Math) FactorySubject.make(0);
        Language s2 = (Language) FactorySubject.make(1);
        History s3 = (History) FactorySubject.make(2);
        English s4 = (English) FactorySubject.make(3);

        s1.setName("MT1186");
        s1.setLevel(5);
        s1.setTeacher("James Abdey");
        s1.setSchedule("08:00 - 10:00");
        s1.setCalculatorType("Scientific");


        s1.showSubject();

        Student student1 = new Student();
        student1.setCode(23456);
        student1.setName("Mauricio");
        student1.setLastname("Vargas");

        Student student2 = new Student();
        student2.setCode(12566);
        student2.setName("Pedro");
        student2.setLastname("Bolonia");

        Student student3 = new Student();
        student3.setCode(75743);
        student3.setName("Sandra");
        student3.setLastname("Perez");

        Student student4 = new Student();
        student4.setCode(22346);
        student4.setName("Roberto");
        student4.setLastname("Osorio");

        Student student5 = new Student();
        student5.setCode(23536);
        student5.setName("Juan");
        student5.setLastname("Prado");

        ISubject[] registration = {s1};


        student1.register(registration);
        student2.register(registration);
        student3.register(registration);
        student4.register(registration);
        student5.register(registration);


    }

}
