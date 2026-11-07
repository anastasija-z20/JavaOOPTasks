package ProbniTest;

import java.util.ArrayList;

public class Fiksni extends Telefon{
    public Fiksni(ArrayList<Kontakt> kontakti, int godina, double cena) {
        super(kontakti, godina, cena);
    }
    @Override
    public void popust(){
        if((2026-getGodina())>10){
            setCena(getCena()-getCena()*0.2);
        }
    }
    //Napraviti objekat FiksniTelefon koji nasledjuje Telefon i daje popust od 20% ukoliko
    // je telefon stariji od 10 godina.

}
