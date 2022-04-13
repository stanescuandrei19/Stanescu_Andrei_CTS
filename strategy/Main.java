package strategy;

public class Main {

    public static void main(String[] args) {
        Validator validator=new Validator(3,new CardCalatorii());
        validator.platesteCalatorie(100);

        validator.setModPlata(new CardBancar());
        validator.platesteCalatorie(100);

        validator.setModPlata(new SMS());
        validator.platesteCalatorie(100);
    }
}
