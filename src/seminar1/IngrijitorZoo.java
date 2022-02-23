package seminar1;

public class IngrijitorZoo {
    private String nume;
    //private Animal animal;

    public void  hranesteAnimal(Animal animal,String hrana){
        animal.mananca(hrana);
    }

    public IngrijitorZoo(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}
