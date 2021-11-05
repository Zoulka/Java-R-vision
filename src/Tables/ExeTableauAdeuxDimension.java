package Tables;

public class ExeTableauAdeuxDimension {
    public static void main(String[] args) {
        int [][] saliou1 ={
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int a, i=0;
        for (int [] saliou2: saliou1){
            a = 0;
            for(int som : saliou2){
                System.out.println("["+i+"]["+a+"]=" + som);
                a++;
            }
            i++;
        }
        String [][] PronomPossessif= {
                {"Mon", "Ton", "Son"},
                {"Ma", "Ta", "Sa"},
                {"Mes", "Tes", "Ses"}
        };
        String j="a";
       for (String [] Pronon: PronomPossessif){
           String s= "A";
           for( String LesPronoms : Pronon){
               System.out.println("["+j+"]["+s+"] =" + LesPronoms);
               s="B";
           }
           j="A";
       }
    }
}
