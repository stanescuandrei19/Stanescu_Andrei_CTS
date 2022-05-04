package memento;

public class Autobuz {
    private String numeSofer;
    private String model;
    private Integer nrLocuri;
    private Integer consumMediu;
    private String anFabricare;


    public Autobuz(String numeSofer, String model, Integer nrLocuri, Integer consumMediu, String anFabricare) {
        this.numeSofer = numeSofer;
        this.model = model;
        this.nrLocuri = nrLocuri;
        this.consumMediu = consumMediu;
        this.anFabricare = anFabricare;
    }


    public void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNrLocuri(Integer nrLocuri) {
        this.nrLocuri = nrLocuri;
    }

    public void setConsumMediu(Integer consumMediu) {
        this.consumMediu = consumMediu;
    }

    public void setAnFabricare(String anFabricare) {
        this.anFabricare = anFabricare;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "numeSofer='" + numeSofer + '\'' +
                ", model='" + model + '\'' +
                ", nrLocuri=" + nrLocuri +
                ", consumMediu=" + consumMediu +
                ", anFabricare='" + anFabricare + '\'' +
                '}';
    }



    public AutobuzMemento genereazaMemento(){
        AutobuzMemento autobuzMemento=new AutobuzMemento(numeSofer,consumMediu);
        return autobuzMemento;
    }


    public void revineLaStareAnterioara(AutobuzMemento autobuzMemento){
        this.numeSofer=autobuzMemento.getNume();
        this.consumMediu=autobuzMemento.getConsum();
    }

}
