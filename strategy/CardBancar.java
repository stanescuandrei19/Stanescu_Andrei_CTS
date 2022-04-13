package strategy;

public class CardBancar implements ModPlata {


    @Override
    public void plateste(float suma) {
        System.out.println("A platit cu cardul");
    }
}
