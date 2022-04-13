package proxy;

public class Main {
    public static void main(String[] args) {
        MijlocTransport autobuzNormal=new Autobuz(0,"Nume 1");
        autobuzNormal.opresteInStatie();
        ((Autobuz) autobuzNormal).setNrCalatori(2);

        MijlocTransport autobuzNoapte=new AutobuzDeNoapte(autobuzNormal);
        autobuzNoapte.opresteInStatie();
    }
}
