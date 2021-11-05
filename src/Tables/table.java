package Tables;

public class table {
    public static void main(String[] args) {

// les tableaux sont utilisés pour stocker plus valeur de meme type dans une seule variable
        String[] person = {"Moussa", "Aliou", "Salihou", "Kaga"};
        System.out.println(person[0]);
        System.out.println(person[1]);
        System.out.println(person[2]);
        System.out.println(person[3]);

    int [] salaire ={100, 200, 700};
    // je peux aussi faire la concatenation des données
    System.out.println(person [3] + " à un salaire de " + salaire[1] + " Euros");

    /* Tableaux à double dimension:
    * est sous forme matricielle, il peut etre initialiser de facon statique  */

        int [][] zoul1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int s, i=0;
        for (int[] zoul2: zoul1){
            s= 0;
            for(int som : zoul2){
                System.out.println("["+i+"]["+s+"]=" + som);
                s++;
            }
            i++;
        }
}}