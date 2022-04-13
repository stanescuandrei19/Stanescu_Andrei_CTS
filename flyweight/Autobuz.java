package flyweight;

public class Autobuz {
    private String model;
    private String anFabricatie;
    private Integer nrLocuri;


    public Autobuz(String model, String anFabricatie, Integer nrLocuri) {
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.nrLocuri = nrLocuri;
    }

    public Integer getNrLocuri() {
        return nrLocuri;
    }

    public void setNrLocuri(Integer nrLocuri) {
        this.nrLocuri = nrLocuri;
    }


    @Override
    public String toString() {
        return "Autobuz{" +
                "model='" + model + '\'' +
                ", anFabricatie='" + anFabricatie + '\'' +
                ", nrLocuri=" + nrLocuri +
                '}';
    }
}
