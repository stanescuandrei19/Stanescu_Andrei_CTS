package chain;

public class Main {
    public static void main(String[] args) {
        TransportHandler troleibuz=new Troleibuz(3);
        TransportHandler autobuz=new Autobuz(5);
        TransportHandler tramvai=new Tramvai(10);
        TransportHandler metrou=new Metrou(100);

        troleibuz.setHandler(autobuz);
        autobuz.setHandler(tramvai);
        tramvai.setHandler(metrou);

        int dist=4;

        troleibuz.deplaseazaRequest(dist);

        TransportHandler autobuzArad=new Autobuz(1000);
        TransportHandler tramvaiArad=new Tramvai(2);

        tramvaiArad.setHandler(autobuzArad);
        tramvaiArad.deplaseazaRequest(5);

    }



}
