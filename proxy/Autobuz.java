package proxy;

import proxy.MijlocTransport;

public class Autobuz implements MijlocTransport
{
    private Integer nrCalatori;
    private String model;

    public Autobuz(Integer nrCalatori, String model) {
        this.nrCalatori = nrCalatori;
        this.model = model;
    }

    public Integer getNrCalatori() {
        return nrCalatori;
    }

    public void setNrCalatori(Integer nrCalatori) {
        this.nrCalatori = nrCalatori;
    }

    @Override
    public void opresteInStatie() {
        System.out.println("Autobuzul a oprit in statie cu" + nrCalatori);
    }
}
