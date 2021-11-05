package Les_ArrayList;

import java.util.ArrayList;

public class araylist {
    public static void main(String[] args) {
        // les arraylist sont des objets jva.util et represent un tableau dynamique
        // creer un arrayList
        ArrayList<String> list = new ArrayList<String>();
    // je vais ajouter des elements dans mon arraylist
    list.add("Aminta");
    list.add("Salihou");
    list.add("Djibrilla");
    list.add("Siddik");
    list.add(0, "Kaga"); // ici j'ai ajouté un index de type 0 pour facilter à avoir cette donnée
// pour afficher la taille de ma table, on procede on ajoute liste.size()
    System.out.println("la taille de mon arrayliste est " + list.size());

    //pour afficher le contenu de mon Arraylist de table on ajoute list à la fin
        System.out.println("le contenu de mon arrayliste est " + list);

   // pour supprimer un objet dans mon arraylist, on utilise le nom de arrylist.remove("l'objet à supprimer")
 list.remove("Kaga");

 //Afficher l'ArrayList apres suppression
 System.out.println(list);

    }
}
