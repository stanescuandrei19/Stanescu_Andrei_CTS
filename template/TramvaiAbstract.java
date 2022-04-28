package template;

public abstract class TramvaiAbstract {

    protected abstract void oprireStatie1();
    protected abstract void oprireStatie2();
    protected abstract void oprireStatie3();

    //public abstract void oprireStatie4();
    //public abstract void oprireStatie5();
    //public abstract void oprireStatie6();

    public final void parcurgereTraseu(){
    oprireStatie1();
    oprireStatie2();
    oprireStatie3();
    }

    public final void parcurgereTraseuInvers(){
        oprireStatie3();
        oprireStatie2();
        oprireStatie1();

    }



}
