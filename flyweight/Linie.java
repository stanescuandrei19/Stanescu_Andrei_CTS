package flyweight;

public class Linie implements AutobuzLinie{

    private Integer nrLinie;
    private String primaStatie;
    private String ultimaStatie;

    public Linie(Integer nrLinie, String primaStatie, String ultimaStatie) {
        this.nrLinie = nrLinie;
        this.primaStatie = primaStatie;
        this.ultimaStatie = ultimaStatie;
    }

    public Integer getNrLinie() {
        return nrLinie;
    }

    @Override
    public String toString() {
        return "Linie{" +
                "nrLinie=" + nrLinie +
                ", primaStatie='" + primaStatie + '\'' +
                ", ultimaStatie='" + ultimaStatie + '\'' +
                '}';
    }

    @Override
    public void afiseazaDescrierea(Autobuz autobuz) {
        System.out.println( this.toString() + autobuz.toString());
    }
}
