package builder;

public class AutobuzBuilder implements Builder{


    private Autobuz auto;

    public AutobuzBuilder() {
        auto=new Autobuz();
    }

    @Override
    public Autobuz build() {
        return auto;
    }
    public AutobuzBuilder setModel(String model) {
        auto.setModel(model);
        return this;
    }

    public AutobuzBuilder setNumeSofer(String numeSofer) {
        auto.setNumeSofer(numeSofer);
        return this;
    }

    public AutobuzBuilder setNrInmatricualre(String nrInmatricualre) {
        auto.setNrInmatricualre(nrInmatricualre);
        return this;
    }

    public AutobuzBuilder setStop(Boolean stop) {
        auto.setStop(stop);
        return this;
    }

    public AutobuzBuilder setOpenDoors(Boolean openDoors) {
        auto.setOpenDoors(openDoors);
        return this;
    }

    public AutobuzBuilder setText(String text) {
        auto.setText(text);
        return this;
    }

    public AutobuzBuilder setNrLinie(String nrLinie) {
        auto.setNrLinie(nrLinie);
        return this;
    }

    public AutobuzBuilder setIsnNew(Boolean isnNew) {
        auto.setIsnNew(isnNew);
        return this;
    }

}
