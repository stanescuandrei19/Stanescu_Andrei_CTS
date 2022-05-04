package state;

public class InCursa implements StareAutobuz{
    @Override
    public void modificaStare(Autobuz autobuz) {
        if(autobuz.getStare() instanceof LaSfarsitDeLinie){
            autobuz.setStare(this);
            System.out.println("autobuzul " + autobuz.getNrAutobuz() + "A PORNIT IN CURSA");


        }

        else{
            System.out.println("autobuzul " + autobuz.getNrAutobuz() + "nu poate sa plece in cursa");
        }
    }
}
