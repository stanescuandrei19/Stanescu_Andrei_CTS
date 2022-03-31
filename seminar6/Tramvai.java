package seminar6;

public class Tramvai extends MijlocTransport{
    private String numeVatman;

    public Tramvai(String nrInmatriculare, String numeVatman) {
        super(nrInmatriculare);
        this.numeVatman = numeVatman;
    }

    public void setNumeVatman(String numeVatman) {
        this.numeVatman = numeVatman;
    }

    @Override
    public MijlocTransport copiaza() throws CloneNotSupportedException {
        return (MijlocTransport) this.clone();
    }

    @Override
    public String toString() {
        return "Tramvai{" +super.toString()+
                "numeVatman='" + numeVatman + '\'' +
                '}';
    }
}
