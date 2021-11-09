package Les_boucles_ou_iterator;

public class for_each {

    public static void main(String[] args) {
 /* Quand on veut travailler avec le tableau il est préférable d’utiliser
 for each à for ,  c’est une forme améliorée de la boucle for.

 - Voici comment fonctionne la boucle for-each en Java. Pour chaque itération,
 la boucle for-each parcourt chaque élément dans le tableau donné (array),
⁃	stocke chaque élément dans une variable (var)
⁃	et exécute le corps de la boucle.

 * */

        int tableau [] ={100, 110, 120, 130, 140, 150};

        for(int i: tableau){
            System.out.println(i); // pour afficher le contenu du tableau
/* Ce pendant, cette boucle for-each a des limites:
*-elle ne convienne pas lorsque vous souhaitez modifier un tableau
-Elle ne garde pas la trace de l’index,
-elle parcourt le tableau en un seul sens
-Elle ne peut pas traiter des conditions if avec un tableaux indexé

* */

    }
}}
