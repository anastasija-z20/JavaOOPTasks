package ProbniTest;

import java.util.ArrayList;

public class MobilniTelefon extends Telefon{
    private boolean premiumPaket;
    public MobilniTelefon(ArrayList<Kontakt> kontakti, int godina, double cena, boolean premiumPaket) {
        super(kontakti, godina, cena);
        this.premiumPaket=premiumPaket;
    }
    public void novaCena(){
        if(premiumPaket==true){
            setCena(getCena()+getCena()*0.2);
        }
    }

    public boolean isPremiumPaket() {
        return premiumPaket;
    }

    public void setPremiumPaket(boolean premiumPaket) {
        this.premiumPaket = premiumPaket;
    }

    //Napraviti objekat MobilniTelefon koji nasledjuje Telefon i on ima dodatnu varijablu
    // za premium paket (Boolean). Napraviti metodu:
    //- novaCena() -> ukoliko mobilni ima premium paket, njegova cena ce da poraste za 20%
}
