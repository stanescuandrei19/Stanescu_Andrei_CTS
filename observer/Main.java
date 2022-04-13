package observer;

public class Main {
    public static void main(String[] args) {
        Autobuz a1=new Autobuz(1);
        Calator c1=new Calator("Popa");
        Calator c2=new Calator("Ion");
        Calator c3=new Calator("vlad");

        a1.aboneaza(c1);
        a1.aboneaza(c2);
        a1.aboneaza(c3);

        a1.dezaboneaza(c3);
        a1.pleacaDeLaCapat();

    }


}
