package composite;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class Grup implements NodAbstract{
    List<NodAbstract> lista;
    private String denumire;

    public Grup(String denumire) {
        super();
        this.denumire = denumire;
        lista=new ArrayList<>();
    }

    @Override
    public void afiseazaDescriere() throws ExecutionException {
        System.out.println("Denumirea grupului este: " + this.denumire);

        for(NodAbstract i: lista){
            i.afiseazaDescriere();
        }
    }

    @Override
    public NodAbstract get(int poz) throws ExecutionException {
        return lista.get(poz);
    }

    @Override
    public void add(NodAbstract nodAbs) throws ExecutionException {
     lista.add(nodAbs);
    }

    @Override
    public void remove(NodAbstract nodAbs) throws ExecutionException {lista.remove(nodAbs);
    }
}
