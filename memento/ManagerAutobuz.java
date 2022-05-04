package memento;

import java.util.ArrayList;
import java.util.List;

public class ManagerAutobuz {
    private List<AutobuzMemento> autobuze;


    public ManagerAutobuz(List<AutobuzMemento> autobuze) {
        this.autobuze = new ArrayList<>();


    }

    public ManagerAutobuz() {
        this.autobuze = new ArrayList<>();
    }

    public void adaugaMemento(AutobuzMemento autobuzMemento){
        autobuze.add(autobuzMemento);
    }


    public AutobuzMemento getMemento(int poz){
        return autobuze.get(poz);
    }

}
