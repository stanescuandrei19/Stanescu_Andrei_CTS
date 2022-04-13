package decorator;

public class DecoratorOcazie extends Decorator{
private String mesaj;

    public DecoratorOcazie(Printer printer,String mesaj) {
        super(printer);
        this.mesaj=mesaj;
    }


    @Override
    public void printeazaMesaj() {
        System.out.println(mesaj);
    }
}
