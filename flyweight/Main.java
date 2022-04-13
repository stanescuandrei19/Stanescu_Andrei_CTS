package flyweight;

public class Main {

    public static void main(String[] args) {
        Autobuz autobuz1=new Autobuz("AA","2022",100);
        Autobuz autobuz2=new Autobuz("AA","2022",100);
        Autobuz autobuz3=new Autobuz("BB","2022",50);
        Autobuz autobuz4=new Autobuz("CC","2022",70);
        Autobuz autobuz5=new Autobuz("CC","2022",70);

        LinieFactory factory=new LinieFactory();

       Linie linie1= factory.getLinie(168);
       Linie linie2= factory.getLinie(137);

        linie1.afiseazaDescrierea(autobuz1);
        linie1.afiseazaDescrierea(autobuz2);
        linie2.afiseazaDescrierea(autobuz3);
        linie2.afiseazaDescrierea(autobuz4);


    }
}
