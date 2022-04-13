package strategy;

public class Validator {
    private float pret;
    ModPlata modPlata;


    public Validator(float pret, ModPlata modPlata) {
        this.pret = pret;
        this.modPlata = modPlata;
    }



    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void platesteCalatorie(float suma){
        modPlata.plateste(suma);
    }
}
