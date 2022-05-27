package practica1.abstractFactory;

public class Math implements ISubject{
    private String name;
    private String teacher;
    private String schedule;
    private int level;
    private String calculatorType;

    @Override
    public void showSubject() {
        System.out.println("-*-*-"+name+"-*-*-");
        System.out.println("Teacher encharged: "+teacher);
        System.out.println("Schedule: "+schedule);
        System.out.println("Level: "+level);
        System.out.println("Calculator type: "+calculatorType);
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getCalculatorType() {
        return calculatorType;
    }

    public void setCalculatorType(String calculatorType) {
        this.calculatorType = calculatorType;
    }
}
