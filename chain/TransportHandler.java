package chain;

public abstract class TransportHandler {
protected TransportHandler handler;

protected int pragDist;

    public void setHandler(TransportHandler handler) {
        this.handler = handler;
    }

    public abstract void deplaseazaRequest(int dist);

    public TransportHandler(int pragDist) {
        this.handler = null;
        this.pragDist=pragDist;
    }


}
