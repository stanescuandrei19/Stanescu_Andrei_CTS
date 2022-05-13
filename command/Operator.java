package command;

import java.util.ArrayList;
import java.util.List;

public class Operator {


    private List<Comanda> comenzi;

    public Operator() {
        this.comenzi = new ArrayList<>();
    }

    public void addComanda(Comanda comanda){
        comenzi.add(comanda);
    }

    public void executaComanda(){
        if(!comenzi.isEmpty()) {
            comenzi.get(0).executa();
            comenzi.remove(0);
        }
    }
}
