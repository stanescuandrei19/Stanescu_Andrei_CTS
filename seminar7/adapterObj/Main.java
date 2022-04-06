package main;

import validatoareSubterane.ValidatorMetrou;
import validatoareSubterane.ValidatorSubteran;
import validatoareTerestre.ValidatorAutobuz;
import validatoareTerestre.ValidatorTerestru;

public class Main {
    public static void validateBilet(ValidatorTerestru vt){
        vt.valideazaBilet();

    }
    public static void main(String[] args) {
        ValidatorSubteran vs=new ValidatorMetrou();
        ValidatorTerestru vt=new ValidatorAutobuz();
        validateBilet(vt);

        Adapter adapter=new Adapter(vs);
        validateBilet(adapter);

    }
}
