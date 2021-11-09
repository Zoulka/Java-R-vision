package Les_boucles_ou_iterator;

public class do_while {
    public static void main(String[] args) {

/* C’est une variante de la boucle while, elle se différencie
par le fait de l’exécution des instructions avant la vérification
de la condition.

- La condition de la boucle do-while doit renvoyer une valeur
 booléenne, sinon, elle générera une erreur au moment de la compilation.
* */
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);


        // Exo1 sur do-while
        int a = 10;
        int b= 20;
        do {
            System.out.println("la valeur a est :" + a);
            a++;
        } while (a <= b);
    }
}