package main;

import composite.Autobuz;
import composite.Grup;
import composite.NodAbstract;

import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {

        NodAbstract a1=new Autobuz("Dacia","AA",7);
        NodAbstract a2=new Autobuz("Dacia","AA",10);
        NodAbstract a3=new Autobuz("Dacia","AA",45);

        NodAbstract grupMici=new Grup("Autobuze mici");
        NodAbstract grupMari=new Grup("Autobuze mari");
        NodAbstract flota=new Grup("Flota ");

        try{
            grupMici.add(a1);
            grupMici.add(a2);
            grupMari.add(a3);

            flota.add(grupMari);
            flota.add(grupMici);
            flota.afiseazaDescriere();
        }

        catch(ExecutionException e){

            e.printStackTrace();

        }

    }


}
