package practica2.ej5;

public class Client {
    public static void main(String[] args){
        Git git = new Git();
        Github repository = new Github();

        Programmer p1 = new Programmer("Eynar");
        Programmer p2 = new Programmer("Jose");
        Programmer p3 = new Programmer("Reynaldo");

        git.add(p1);
        git.add(p2);
        git.add(p3);

        Codigo codigo = new Codigo("public static void main(String[] args) {");
        git.setCommit(codigo);
        repository.createCommit("Commit 1", git.createCommit());
        codigo = new Codigo(codigo.getTexto() + " int number = 2; ");
        git.setCommit(codigo);
        repository.createCommit("Commit 2", git.createCommit());
        codigo = new Codigo(codigo.getTexto() + " int bigNumber = 100; ");
        git.setCommit(codigo);
        repository.createCommit("Commit 3", git.createCommit());
        codigo = new Codigo(codigo.getTexto() + " int addition; ");
        git.setCommit(codigo);
        repository.createCommit("Commit 4", git.createCommit());
        codigo = new Codigo(codigo.getTexto() + " addition = number + bigNumber; ");
        git.setCommit(codigo);
        repository.createCommit("Commit 5", git.createCommit());

        codigo = git.restoreCommit(repository.getCommit("Commit 1"), "Commit 1");
        codigo.showCodigo();

        git.remove(p1);
        git.remove(p2);
        git.remove(p3);

        Programmer p4 = new Programmer("Carlos");
        Programmer p5 = new Programmer("Pedro");
        Programmer p6 = new Programmer("Laura");

        git.add(p4);
        git.add(p5);
        git.add(p6);

        codigo = git.restoreCommit(repository.getCommit("Commit 5"), "Commit 5");
        codigo.showCodigo();
    }
}
