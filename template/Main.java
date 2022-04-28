package template;

public class Main {

    public static void main(String[] args) {
        TramvaiAbstract tramvai=new Tramvai();
        TramvaiAbstract tramvaiProbe=new TramvaiProbe();

        tramvai.parcurgereTraseu();
        tramvai.parcurgereTraseuInvers();

        tramvaiProbe.parcurgereTraseu();
        tramvaiProbe.parcurgereTraseuInvers();


    }
}
