package practica1.abstractFactory;

public class FactorySubject {
    public static ISubject make(int subject){
        ISubject is;
        SubjectsList subjectPosition = SubjectsList.values()[subject];
        switch(subjectPosition){
            case Math -> is = new Math();
            case English -> is = new English();
            case History -> is = new History();
            default -> is = new Language();
        }
        return is;
    }
}
