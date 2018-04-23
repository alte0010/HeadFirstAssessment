import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashMap;

public class Trein {

    private TreinConducteur conducteur;
    private HashMap<String, Nameable> stoelen = new LinkedHashMap<String, Nameable>();

    public Trein(TreinConducteur conducteur) {

        this.conducteur = conducteur;
    }

    public void instappen(Nameable nameable1, Nameable nameable2, Nameable nameable3, Nameable nameable4, Nameable nameable5, Nameable nameable6, Nameable nameable7){
        instappen(nameable1);
        instappen(nameable2);
        instappen(nameable3);
        instappen(nameable4);
        instappen(nameable5);
        instappen(nameable6);
        instappen(nameable7);
    }

    public void instappen (Nameable nameable8, Nameable nameable9) {
        instappen(nameable8);
        instappen(nameable9);
    }

    public void instappen(Nameable nameable) {
        String key = nameable.getName();
        Nameable value = nameable;
        this.stoelen.put(key, value);
        showInfo(nameable, " is ingestapt.");
    }

    private void showInfo(Nameable uitgestapte, String actie) {

        System.out.println(uitgestapte.getName() + actie);
    }

    private int getCount() {
        return stoelen.size();
    }


    public Nameable uitstappen(String name) {

        if (!stoelen.containsKey(name)) {
            System.out.println(name + "zit in de trein");
            return null;
        }
        Nameable uitgestapte = stoelen.get(name);
        stoelen.remove(name);
        showInfo(uitgestapte, " is uitgestapt.");
        return uitgestapte;
    }

    public Nameable uitgooien(String name) {

        Nameable uitgegooide = stoelen.get(name);
        stoelen.remove(name);
        showInfo(uitgegooide, " is uit de trein gegooid.");
        return uitgegooide;
    }

    public String[] getNames() {
        String[] names = new String[getCount()];
        int i = 0;
        for (String key : stoelen.keySet()) {
            names[i] = key;
            i++;
        }
        return names;
    }

    public void info() {
        System.out.println(this);
    }

    public String toString() {
        return "Er zitten " + getCount() + " passagiers in de trein.";
    }

    public void printNames() {
        System.out.println("Deze passagiers zitten in de trein:");
        for (Map.Entry<String, Nameable> entry : stoelen.entrySet()) {
            String key = entry.getKey();
            System.out.println("- " + key);
        }
    }
}
