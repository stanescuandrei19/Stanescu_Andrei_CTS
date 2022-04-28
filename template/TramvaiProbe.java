package template;

public class TramvaiProbe extends TramvaiAbstract{

    @Override
    public void oprireStatie1() {
        System.out.println("Pleaca de la capat de linie");
    }

    @Override
    public void oprireStatie2() {
        System.out.println("Nu opreste in statie!!");
    }

    @Override
    public void oprireStatie3() {
        System.out.println("Ajunge in capat de linie");
    }
}
