package ProbniTest;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Telefon {
    //Napraviti objekat Telefon koji od atributa ima listu kontakta, godinu proizvodnje i cenu.
    // Napraviti metode:
    //- obrisi(Kontakt k) -> brise prosledjeni kontakt
    //- nalaziSe(Kontakt k) -> proverava da li se dati kontakt nalazi u listi
    //- popust() -> ukoliko je telefon stariji od 5 godina, dati 30% popusta
    //- sveNaA() -> izlistava sve kontakte koji pocinju sa 'A'
    private ArrayList<Kontakt> kontakti;
    private int godina;
    private double cena;
    public Telefon(ArrayList<Kontakt> kontakti, int godina, double cena){
        this.kontakti=kontakti;
        this.godina=godina;
        this.cena=cena;
    }
    public void obrisi(Kontakt k){
        ArrayList<Kontakt> kont = new ArrayList<>();
        for(int i=kontakti.size()-1;i>=0;i--){
            if(kontakti.get(i).equals(k)){
                kontakti.remove(i);
                kont.add(kontakti.get(i));
            }
        }
    }
    public boolean nalaziSe(Kontakt k) {
        boolean nalazi= false;
        for (Kontakt el:kontakti){
            if(el.equals(k)){
                nalazi=true;
            }
        }
        return nalazi;
    }
    public void popust(){
        if((2026 - godina)>5){
            setCena(getCena()-getCena()*0.3);
        }
    }
    public void sveNaA(){
        ArrayList<Kontakt> kont = new ArrayList<>();
        for(Kontakt e:kontakti){
            if(e.getNaziv().charAt(0)=='A'){
                kont.add(e);
                System.out.println(kont);
            }
        }
    }

    public ArrayList<Kontakt> getKontakti() {
        return kontakti;
    }

    public void setKontakti(ArrayList<Kontakt> kontakti) {
        this.kontakti = kontakti;
    }

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
    public String toString(){
        return kontakti+" ("+godina+")"+", cena: "+cena;
    }
}
