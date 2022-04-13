package observer;

public class Calator implements Observer{
    private String nume;

    public Calator(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteSMS(String mesaj) {
        System.out.println(nume + " ai primit mesajul " + mesaj);
    }
}
