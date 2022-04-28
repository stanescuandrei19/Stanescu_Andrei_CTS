package chain;

public class Autobuz extends TransportHandler{
    public Autobuz(int pragDist) {
        super(pragDist);
    }

    @Override
    public void deplaseazaRequest(int dist) {
        if(dist<pragDist){
            System.out.println("Mergeti cu autobuzul");

        }
        else{

            handler.deplaseazaRequest(dist);
        }
    }
}
