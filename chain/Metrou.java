package chain;

public class Metrou extends TransportHandler{
    public Metrou(int pragDist) {
        super(pragDist);
    }

    @Override
    public void deplaseazaRequest(int dist) {
        System.out.println("Megeti cu metroul");
    }
}
