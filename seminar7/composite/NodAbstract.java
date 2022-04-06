package composite;

import java.util.concurrent.ExecutionException;

public interface NodAbstract {

    void afiseazaDescriere() throws ExecutionException;
    NodAbstract get(int poz) throws ExecutionException;
    void add(NodAbstract nodAbs) throws ExecutionException;
    void remove(NodAbstract nodAbs) throws ExecutionException;

}
