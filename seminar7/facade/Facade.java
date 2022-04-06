package clase;

public class Facade {

    private Autobuz autobuz;

    public Facade() {
        autobuz=new Autobuz();
    }



    public void deschideUsi(){
        autobuz.deschideUsaFata();
        autobuz.deschideUsaSpate();
        autobuz.deschideUsaMij();

    }

    public void liberUsi(){
        autobuz.liberUsaFata();
        autobuz.liberUsaMij();
        autobuz.liberUsaSpate();

    }

}
