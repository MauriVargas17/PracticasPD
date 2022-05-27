package practica1.abstractFactory;

public class Student {
    private String name;
    private String lastname;
    private int code;
    private ISubject[] subjects;

    public void register(ISubject[] subjects){
        this.subjects = subjects;
        System.out.println(name+" "+lastname+" is registered to: ");
        for(ISubject i : subjects){
            System.out.println(i.getName());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
