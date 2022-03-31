package seminar6;

public class Autobuz extends MijlocTransport{
    private String numeSofer;


    public Autobuz(String nrInmatriculare, String numeSofer) {
        super(nrInmatriculare);
        this.numeSofer = numeSofer;
    }

    public void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }


    @Override
    public MijlocTransport copiaza() throws CloneNotSupportedException {
        return (MijlocTransport) this.clone();
    }

    @Override
    public String toString() {
        return "Autobuz{" + super.toString() +
                "numeSofer='" + numeSofer + '\'' +
                '}';
    }
}
