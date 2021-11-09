package Les_boucles_ou_iterator;

public class boucle_for {
    public static void main(String[] args) {
        for(int i=0; i<6; i++){

            System.out.println(i);
        }
/*Explication :
•	int i = 0 : Initialise la variable i à 0.
•	i < 6 : Définit la condition d’exécution de la boucle (i doit être inférieur à 6).
Si la condition est true, la boucle recommencera, si elle est false, la boucle se terminera.
•	i++ : Incréments la valeur chaque fois que le bloc de code a été exécuté.

* */
        for (int i=4; i<10; i++){
            System.out.println("la valeur de i est " + i);
        }

        for (int a=0; a<12; a++){
            System.out.println("la valeur de a est : " + a);
        }
    }
}
