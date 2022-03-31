package seminar6;

public abstract class MijlocTransport implements Cloneable{
    private String NrInmatriculare;


    public MijlocTransport(String nrInmatriculare) {
        NrInmatriculare = nrInmatriculare;
    }

    public MijlocTransport() {

    }

    public void setNrInmatriculare(String nrInmatriculare) {
        NrInmatriculare = nrInmatriculare;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public abstract MijlocTransport copiaza() throws CloneNotSupportedException;

    @Override
    public String toString() {
        return "MijlocTransport{" +
                "NrInmatriculare='" + NrInmatriculare + '\'' +
                '}';
    }
}
