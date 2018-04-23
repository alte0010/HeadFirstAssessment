public class Main {

    public static void main(String[] args) {
        TreinConducteur conducteur = new TreinConducteur("Dyon");
        Dog henk = new Dog("Loebas");

        Trein trein = new Trein(conducteur);
        System.out.println(trein);

        //bushalte 1
        TreinreizigerKlas1 kwik = new Passagier ("Kwik");
        TreinreizigerKlas1 kwek = new Passagier ("Kwek");
        TreinreizigerKlas1 kwak = new Passagier ("Kwak");

        trein.instappen(kwik, kwek, kwak);
        System.out.println(trein);

        //bushalte 2
        TreinreizigerKlas2 Bas = new Passagier("Bas");
        trein.instappen(bas);
        System.out.println(trein);

        //bushalte 3
        TreinreizigerKlas1 Joery = new Passagier("Joery");
        trein.instappen(joery);
        System.out.println(trein);

        //controle
        Passagier uitgestapte = (Passagier) trein.uitstappen("Bas");
        System.out.println(bus);

        //Wie zit er in de bus?
        trein.printNames();


        TreinStation vlissingen = new TreinStation();
        vlissingen.rijdtBinnen(trein);

        trein.info();
        trein.printNames();
    }
}
