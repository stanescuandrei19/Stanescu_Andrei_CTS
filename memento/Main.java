package memento;

public class Main {


    public static void main(String[] args) {
        Autobuz autobuz=new Autobuz("Andrei","AA",100,20,"2012");
        ManagerAutobuz managerAutobuz=new ManagerAutobuz();

        autobuz.genereazaMemento();
        managerAutobuz.adaugaMemento(autobuz.genereazaMemento());

        autobuz.setNumeSofer("Viorel");
        System.out.println(autobuz.toString());
        managerAutobuz.adaugaMemento(autobuz.genereazaMemento());
        autobuz.setConsumMediu(30);
        managerAutobuz.adaugaMemento(autobuz.genereazaMemento());
        System.out.println(autobuz.toString());
        autobuz.revineLaStareAnterioara(managerAutobuz.getMemento(0));
        System.out.println(autobuz.toString());

    }
}
