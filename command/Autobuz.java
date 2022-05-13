package command;

public class Autobuz {
    private String nrInmatriculare;


    public Autobuz(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }


    public void pleacaPeTraseu(int nrLinie){
        System.out.println("Autobuzul cu nr de inmatriculare " + nrInmatriculare + " a plecat pe traseu pe linia " + nrLinie);
    }


}
