package Les_ArrayList;

import java.util.ArrayList;

public class ExoArraylist {
    public static void main(String[] args) {
        ArrayList<String> Recensemment = new ArrayList<String>();

Recensemment.add("Moussa");
Recensemment.add("Guide");
Recensemment.add("Doumma");
Recensemment.add("Maiga");

// pour afficher le contenu de ma table arraylist Recensement
System.out.println(Recensemment);

// pour afficher la taille de table
        System.out.println("la taille de ma table est : " + Recensemment.size());
 // si je v suupprimer un nom dans ma table
        System.out.println(Recensemment.remove("Moussa"));

// afficher apres suppression
        System.out.println(Recensemment);
    }
}