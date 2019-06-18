import java.util.ArrayList;
import java.util.List;

public class Student extends Osoba {


    private String kierunek;
    private RokStudiów rokStudiów;



    public List<Przedmioty> getMap() {
        return map;
    }

    private List <Przedmioty> map = new ArrayList<>();

    public RokStudiów getRokStudiów() {
        return rokStudiów;
    }

    public Student(String imie, String nazwisko, int wiek, String email, String numerTelefonu, String kierunek, List<Przedmioty> map, RokStudiów rokStudiów) {
        super(imie, nazwisko, wiek, email, numerTelefonu);
        this.kierunek = kierunek;
        this.map = map;
        this.rokStudiów = rokStudiów;
    }


    public void addAll(){
        setImie(new String());
        setNazwisko(new String());

    }


    public String getKierunek() {
        return kierunek;
    }



    public void setKierunek(String kierunek) {
        this.kierunek = kierunek;
    }



    public void String(String ImieNazwisko){
      ImieNazwisko = getImie() + getNazwisko();
    }


    @Override
    public String toString() {
        return
                "Imie i Nazwisko studenta: "  + getImie() + " " + getNazwisko() + " " + getWiek()+"\n";

    }
    public String Wiek(){
        return "Wiek:" + getWiek() + getImie() + getNazwisko();

    }
}
