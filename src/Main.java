public class Main {

    public static void main(String[] args) {
        TreinConducteur conducteur = new TreinConducteur("Dyon");
        Trein trein = new Trein(conducteur);
        System.out.println(trein);

        //treinstation Goes
        TreinreizigerKlas2 kwik = new TreinreizigerKlas2 ("Kwik");
        TreinreizigerKlas2 kwek = new TreinreizigerKlas2 ("Kwek");
        TreinreizigerKlas2 kwak = new TreinreizigerKlas2 ("Kwak");
        TreinreizigerKlas2 kwuk = new TreinreizigerKlas2 ("Kwuk");
        TreinreizigerKlas2 kwok = new TreinreizigerKlas2 ("Kwok");
        TreinreizigerKlas1 jesper = new TreinreizigerKlas1 ("Jesper");
        Zwartrijder joery = new Zwartrijder ("Zwartrijdende Joery");

        trein.instappen(kwik, kwek, kwak, kwuk, kwok, jesper, joery);
        System.out.println(trein);

        //treinstation Arnemuiden
        TreinreizigerKlas2 Bas = new TreinreizigerKlas2("Bas");
        TreinreizigerKlas2 Raphael = new TreinreizigerKlas2("Raphael");
        trein.instappen(Bas, Raphael);
        System.out.println(trein);

        //treinspoor Arnemuiden-Middelburg
        Zwartrijder uitgegooide = (Zwartrijder) trein.uitgooien("Zwartrijdende Joery");
        System.out.println(trein);

        //treinstation Middelburg
        TreinreizigerKlas1 Shawn = new TreinreizigerKlas1("Shawn");
        trein.instappen(Shawn);
        System.out.println(trein);

        //treinstation Oost-Souburg Vlissingen
        TreinreizigerKlas2 uitstappen = (TreinreizigerKlas2) trein.uitstappen ("Bas");
        TreinreizigerKlas2 uitstappen2 = (TreinreizigerKlas2) trein.uitstappen ("Raphael");
        System.out.println(trein);

        //treinstation Vlissingen
        TreinreizigerKlas2 uitstappen3 = (TreinreizigerKlas2) trein.uitstappen ("Kwik");
        TreinreizigerKlas2 uitstappen4 = (TreinreizigerKlas2) trein.uitstappen ("Kwek");
        TreinreizigerKlas2 uitstappen5 = (TreinreizigerKlas2) trein.uitstappen ("Kwak");
        TreinreizigerKlas2 uitstappen6 = (TreinreizigerKlas2) trein.uitstappen ("Kwuk");
        TreinreizigerKlas2 uitstappen7 = (TreinreizigerKlas2) trein.uitstappen ("Kwok");
        TreinreizigerKlas1 uitstappen8 = (TreinreizigerKlas1) trein.uitstappen ("Jesper");
        TreinreizigerKlas1 uitstappen9 = (TreinreizigerKlas1) trein.uitstappen ("Shawn");
        System.out.println(trein);

        //Wie zit er in de bus?
        trein.printNames();

    }
}
