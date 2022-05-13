package command;

public class Main {

    public static void main(String[] args) {
        Autobuz a1=new Autobuz("AAA");
        Autobuz a2=new Autobuz("AAB");

        Operator operator=new Operator();



        operator.addComanda(new ComandaPlecareTraseu(2,a1));
        operator.addComanda(new ComandaPlecareTraseu(2,a2));
        operator.addComanda(new ComandaPlecareTraseu(5,a1));
        operator.addComanda(new ComandaPlecareTraseu(5,a2));

        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();


    }
}
