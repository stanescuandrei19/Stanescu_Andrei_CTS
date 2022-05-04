package state;

public class Autobuz {


    private StareAutobuz stare;
    private Integer nrAutobuz;


    public Autobuz(Integer nrAutobuz) {
        this.nrAutobuz = nrAutobuz;
        this.stare=new LaSfarsitDeLinie();
    }

    public StareAutobuz getStare() {
        return stare;
    }

     void setStare(StareAutobuz stare) {
        this.stare = stare;
    }

    public Integer getNrAutobuz() {
        return nrAutobuz;
    }

    public void setNrAutobuz(Integer nrAutobuz) {
        this.nrAutobuz = nrAutobuz;
    }

    public void pleacaInCursa(){
        StareAutobuz stare=new InCursa();
        stare.modificaStare(this);

    }
    public void ajungeLaCapatDeLinie(){
        LaSfarsitDeLinie stare=new LaSfarsitDeLinie();
        stare.modificaStare(this);



    }
    public void trimiteInService(){
        LaReparat stare=new LaReparat();
        stare.modificaStare(this);



    }
    public void scoateDinService(){
        LaSfarsitDeLinie stare=new LaSfarsitDeLinie();
        stare.modificaStare(this);


    }

}
