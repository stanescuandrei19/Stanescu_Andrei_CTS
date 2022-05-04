package state;

public class LaSfarsitDeLinie implements StareAutobuz{


    @Override
    public void modificaStare(Autobuz autobuz) {
        if(!(autobuz.getStare() instanceof LaSfarsitDeLinie)){
            autobuz.setStare(this);
            System.out.println("Autobuzul " + autobuz.getNrAutobuz() +  "a ajuns la capat de linie");
        }

        else{
            System.out.println("Mesaj sfarsit linie");
        }
    }
}
