package practica2.ej1;

public class Client {
    public static void main(String[] args){
        RevisionesTutor revisionesTutor = new RevisionesTutor();
        CreadorAvances creadorAvances = new CreadorAvances();

        AvanceTesis avanceTesis = new AvanceTesis("Las poblaciones aymaras previas al imperio incaico tenian comportamientos muy belicos");
        creadorAvances.setAvance(avanceTesis);
        revisionesTutor.revisarAvance(creadorAvances.crearAvance());
        avanceTesis = new AvanceTesis(avanceTesis.getText()+", las cuales vivieron en conflicto por cientos de años");
        creadorAvances.setAvance(avanceTesis);
        revisionesTutor.revisarAvance(creadorAvances.crearAvance());
        avanceTesis = new AvanceTesis(avanceTesis.getText()+". No obstante, tuvieron un desarrollo importante en el sector agropecuario,");
        creadorAvances.setAvance(avanceTesis);
        revisionesTutor.revisarAvance(creadorAvances.crearAvance());
        avanceTesis = new AvanceTesis(avanceTesis.getText()+" innovando en sistemas de riego, arado y sembrado de hortalizas y tuberculos.");
        creadorAvances.setAvance(avanceTesis);
        revisionesTutor.revisarAvance(creadorAvances.crearAvance());
        avanceTesis = new AvanceTesis(avanceTesis.getText()+" Hasta el dia de hoy, las rivalidades de poblaciones se mantienen vigentes.");
        creadorAvances.setAvance(avanceTesis);
        revisionesTutor.revisarAvance(creadorAvances.crearAvance());

        int versionParaRecuperar = 3;
        avanceTesis = creadorAvances.restaurarAvance(revisionesTutor.obtenerAvance(versionParaRecuperar - 1));
        System.out.println(avanceTesis.getText());
    }
}
