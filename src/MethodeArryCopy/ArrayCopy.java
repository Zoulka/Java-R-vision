package MethodeArryCopy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
 /* C’est une méthode de la classe system qui appartient au package java.lang.
  il sert à copier un tableau source spécifié vers la position du tableau de destination.
 Le nombre d’élément copiés est égal à la longueur du tableau
 Ex: La fonction arraycopy(tab, 0, res, 0, len), permet de copier « tab »
 à partir de l’index « 0 » vers « res » de l’index « 0 » vers « len ».
 * */

        int [] tab1 = {1, 2, 3};
        int [] tab2 = {4, 5, 6};

        int len1 = tab1.length;
        int len2  = tab2.length;

        int [] res = new int [len1 + len2];

        System.arraycopy(tab1, 0, res, 0, len1);
        System.arraycopy(tab2, 0, res, len1, len2);

        System.out.println(Arrays.toString(res));

    }
}
