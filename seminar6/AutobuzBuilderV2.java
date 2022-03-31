package builder;

public class AutobuzBuilderV2 implements Builder{
    private String model;
    private String numeSofer;
    private String nrInmatricualre;
    private Boolean stop;
    private Boolean openDoors;
    private String text;
    private String nrLinie;
    private Boolean isnNew;

    public AutobuzBuilderV2() {
        model="Mercedes";
        numeSofer="dorel";
        nrLinie="555";
        stop=true;
        isnNew=true;
        nrInmatricualre="11";
        openDoors=true;
        text="ceva";



    }

    @Override
    public Autobuz build() {
        return new Autobuz(model,numeSofer,nrInmatricualre,stop,openDoors,text,nrLinie,isnNew);
    }

    public AutobuzBuilderV2 setModel(String model) {
        this.model = model;
        return this;
    }

    public AutobuzBuilderV2 setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
        return this;
    }

    public AutobuzBuilderV2 setNrInmatricualre(String nrInmatricualre) {
        this.nrInmatricualre = nrInmatricualre;
        return this;
    }

    public AutobuzBuilderV2 setStop(Boolean stop) {
        this.stop = stop;
        return this;
    }

    public AutobuzBuilderV2 setOpenDoors(Boolean openDoors) {
        this.openDoors = openDoors;
        return this;
    }

    public AutobuzBuilderV2 setText(String text) {
        this.text = text;
        return this;
    }

    public AutobuzBuilderV2 setNrLinie(String nrLinie) {
        this.nrLinie = nrLinie;
        return this;
    }


    public AutobuzBuilderV2 setIsnNew(Boolean isnNew) {
        this.isnNew = isnNew;
        return this;
    }
}
