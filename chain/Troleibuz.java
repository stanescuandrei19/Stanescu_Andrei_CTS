package chain;

public class Troleibuz extends TransportHandler{
    public Troleibuz(int pragDist) {
        super(pragDist);
    }

    @Override
    public void deplaseazaRequest(int dist) {
        if(dist<pragDist){
            System.out.println("Mergeti cu troleibuzul");
        }
        else{
            handler.deplaseazaRequest(dist);
        }
    }
}
