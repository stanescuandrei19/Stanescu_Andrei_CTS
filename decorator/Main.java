package decorator;

public class Main {

    public static void main(String[] args) {
        Printer printer=new PrinterBilet();

        Decorator decorator=new DecoratorOcazie(printer,"La multi ani");
        printer.printeazaBilet();
        decorator.printeazaMesaj();


    }





}
