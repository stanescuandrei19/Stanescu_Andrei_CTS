package composite;

import java.util.concurrent.ExecutionException;

public class Autobuz implements NodAbstract {

private String producator;
private String model;
private int nrLocuri;

    public Autobuz(String producator, String model, int nrLocuri) {
        this.producator = producator;
        this.model = model;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "producator='" + producator + '\'' +
                ", model='" + model + '\'' +
                ", nrLocuri=" + nrLocuri +
                '}';
    }

    public String getProducator() {
        return producator;
    }

    public void setProducator(String producator) {
        this.producator = producator;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNrLocuri() {
        return nrLocuri;
    }

    public void setNrLocuri(int nrLocuri) {
        this.nrLocuri = nrLocuri;
    }

    @Override
    public void afiseazaDescriere() throws ExecutionException{
        throw new ExecutionException(null);
    }

    @Override
    public NodAbstract get(int poz) throws ExecutionException {
        throw new ExecutionException(null);
    }

    @Override
    public void add(NodAbstract nodAbs) throws ExecutionException{
        throw new ExecutionException(null);

    }

    @Override
    public void remove(NodAbstract nodAbs) throws ExecutionException{
        throw new ExecutionException(null);

    }
}
