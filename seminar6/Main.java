package seminar6;

public class Main {
    public static void main(String[] args) {
        Autobuz a1=new Autobuz("AA1","Popescu");
        Autobuz a2=new Autobuz("AA2","Ionescu");
        Autobuz a3=new Autobuz("AA3","Ion");

        Tramvai t1=new Tramvai("TT1","Victor");
        try {
            MijlocTransport a4 = a1.copiaza();
            MijlocTransport t2=t1.copiaza();

            System.out.println( "Autobuz " + a4);
            System.out.println( "Tramvai " + t2);


        }
        catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

    }
}
