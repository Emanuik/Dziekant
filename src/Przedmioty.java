import java.util.ArrayList;
import java.util.List;

class Przedmioty {


    private double ocenaPrzedmiotu;
    private String nazwa;
    private List<Istudent> map = new ArrayList<>();


     public Przedmioty(double ocenaPrzedmiotu, String nazwa, Istudent... map) {
        this.ocenaPrzedmiotu = ocenaPrzedmiotu;
        this.nazwa = nazwa;
    }
    public double getOcenaPrzedmiotu() {
        return ocenaPrzedmiotu;

     }

     public String getNazwa() {
        return nazwa;
    }

    public List<Istudent> getMap() {
        return map;
    }
    public void srednia (double srednia){
        srednia = ocenaPrzedmiotu;
    }


    @Override
    public String toString() {
        return "Nazwa przedmiotu: " + nazwa +
                ", Ocena z przedmiotu: " + ocenaPrzedmiotu + "\n"  ;
    }

 }
