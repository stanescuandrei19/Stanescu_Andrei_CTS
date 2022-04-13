package strategy;

public class SMS implements ModPlata{
    @Override
    public void plateste(float suma) {
        System.out.println("A platit prin SMS");
    }
}
