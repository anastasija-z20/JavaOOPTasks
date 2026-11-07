package ProbniTest;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static void main(String[] args) {

        Kontakt k1 = new Kontakt("At", 06525);
        Kontakt k2 = new Kontakt("Sanja", 1658);
        Kontakt k3 = new Kontakt("Nana", 0256);
        Kontakt k4 = new Kontakt("Tata", 24862);
        Kontakt k5 = new Kontakt("Mama", 2598);
        Kontakt k6 = new Kontakt("Seka", 2567);
        ArrayList<Kontakt> kontakti = new ArrayList<>(Arrays.asList(k1,k2,k3,k4,k5));
        MobilniTelefon S = new MobilniTelefon(kontakti, 2020, 65.0, true);
        MobilniTelefon A = new MobilniTelefon(kontakti, 2016, 25.0, false);
        Fiksni D = new Fiksni(kontakti, 2005, 32.0);
        VokiToki V = new VokiToki(kontakti, 2019, 42.0);
        S.novaCena();
        S.popust();
        System.out.println(S);
        D.popust();
        System.out.println(D);

    }
}
