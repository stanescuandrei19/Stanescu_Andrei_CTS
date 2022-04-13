package decorator;

public class PrinterBilet implements Printer{
    @Override
    public void printeazaBilet() {
        System.out.println(" Bilet STB");
    }
}
