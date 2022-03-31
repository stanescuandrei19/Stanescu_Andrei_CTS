package builder;

public class Autobuz {
    private String model;
    private String numeSofer;
    private String nrInmatricualre;
    private Boolean stop;
    private Boolean openDoors;
    private String text;
    private String nrLinie;
    private Boolean isnNew;

    public Autobuz() {
        model="Mercedes";
        numeSofer="dorel";
        nrLinie="555";
        stop=true;
        isnNew=true;
        nrInmatricualre="11";
        openDoors=true;
        text="ceva";

    }

    public Autobuz(String model, String numeSofer, String nrInmatricualre, Boolean stop, Boolean openDoors, String text, String nrLinie, Boolean isnNew) {
        this.model = model;
        this.numeSofer = numeSofer;
        this.nrInmatricualre = nrInmatricualre;
        this.stop = stop;
        this.openDoors = openDoors;
        this.text = text;
        this.nrLinie = nrLinie;
        this.isnNew = isnNew;
    }

    void setModel(String model) {
        this.model = model;
    }

     void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

     void setNrInmatricualre(String nrInmatricualre) {
        this.nrInmatricualre = nrInmatricualre;
    }

     void setStop(Boolean stop) {
        this.stop = stop;
    }

     void setOpenDoors(Boolean openDoors) {
        this.openDoors = openDoors;
    }

     void setText(String text) {
        this.text = text;
    }

     void setNrLinie(String nrLinie) {
        this.nrLinie = nrLinie;
    }

     void setIsnNew(Boolean isnNew) {
        this.isnNew = isnNew;

    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "model='" + model + '\'' +
                ", numeSofer='" + numeSofer + '\'' +
                ", numeInmatricualre='" + nrInmatricualre + '\'' +
                ", stop=" + stop +
                ", openDoors=" + openDoors +
                ", text='" + text + '\'' +
                ", nrLinie='" + nrLinie + '\'' +
                ", isnNew=" + isnNew +
                '}';
    }
}
