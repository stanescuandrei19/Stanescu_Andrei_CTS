package main;

import validatoareTerestre.ValidatorAutobuz;
import validatoareTerestre.ValidatorTerestru;

public class Main {
    public static void main(String[] args) {
        ValidatorTerestru validatorAuto=new ValidatorAutobuz();
        validatorAuto.valideazaBilet();
        validatorAuto.valideazaAbonament();

        ValidatorTerestru validatorMetrou=new Adapter();
        validatorMetrou.valideazaBilet();
        validatorMetrou.valideazaAbonament();
        


    }


}
