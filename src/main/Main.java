package main;

import seminar1.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        IngrijitorZoo ingr_zoo1=new IngrijitorZoo("Ingrijitor1");
        Zoo z1=new Zoo("Zoo1",ingr_zoo1);
        Zebra zebra1=new Zebra("zebra1");
        Zebra zebra2=new Zebra("zebra2");
        Girafa girafa1=new Girafa("girafa1");
        /*ArrayList<Animal>animals=new ArrayList<>();
        animals.add(zebra1);
        animals.add(zebra2);
        animals.add(girafa1);
        */
        z1.addAnimal(zebra1);
        z1.addAnimal(zebra2);
        z1.addAnimal(girafa1);
        z1.hranesteAnimale("mancare");

    }
}
