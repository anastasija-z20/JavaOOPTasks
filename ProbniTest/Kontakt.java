package ProbniTest;

public class Kontakt {
    //Napraviti objekat Kontakt koji ima naziv i broj telefona.
    private String naziv;
    private int brojTelefona;
    public Kontakt(String naziv, int brojTelefona){
        this.naziv=naziv;
        this.brojTelefona=brojTelefona;
    }
    public String getNaziv(){
        return naziv;
    }
    public void setNaziv(String naziv){
        this.naziv=naziv;
    }
    public int getBrojTelefona(){
        return brojTelefona;
    }

    public void setBrojTelefona(int brojTelefona) {
        this.brojTelefona = brojTelefona;
    }
    public String toString(){
        return naziv+", "+brojTelefona;
    }
}
