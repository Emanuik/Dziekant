public class Osoba {
    private String imie;
    private  String Nazwisko;
    private int Wiek;
    private String email;
    private String numerTelefonu;

    public Osoba(String imie, String nazwisko, int wiek, String email, String numerTelefonu) {
        this.imie = imie;
        Nazwisko = nazwisko;
        Wiek = wiek;
        this.email = email;
        this.numerTelefonu = numerTelefonu;
    }

    public String getImie() {
        return imie;
    }


    public String getNazwisko() {
        return Nazwisko;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        Nazwisko = nazwisko;
    }

    public int getWiek() {
        return Wiek;
    }

    public void setWiek(int newwiek) {
        Wiek = newwiek;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumerTelefonu() {
        return numerTelefonu;
    }

    public void setNumerTelefonu(String numerTelefonu) {
        this.numerTelefonu = numerTelefonu;
    }

    @Override
    public String toString() {
        return "Osoba" +
                "imie='" + imie + '\'' +
                " Nazwisko='" + Nazwisko + '\'' +
                ", Wiek=" + Wiek +
                ", email='" + email + '\'' +
                ", numerTelefonu='" + numerTelefonu + '\''
                ;
    }
}

