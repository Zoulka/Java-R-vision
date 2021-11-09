package Polymorphisme;
/* Le polymorphisme est la capacité d’un objet à prendre plusieurs formes.
 L’utilisation la plus courante du polymorphisme dans la POO se produit
 lorsqu’une référence de classe mère est utilisée pour faire référence à
 un objet de classe fille. Il nous permet d’effectuer une seule action de
 différentes manières. Exemple: On a une superclasse appelée Animal qui a
 une méthode appelée cri(). Les sous-classes d’animaux peuvent être des vaches,
 des chats, des chiens, des oiseaux, et ils ont également leur propre implémentation
 d’un cri (la vache meugle et le chat miaule, etc.):
*
* */
public class Animal {

    public void cri (){
        System.out.println("Les cris des animaux");
    }
}
// ici je crée une classe Mouton et l'extencier avec la classe mere animal et
// lui donner un objet cri
class Mouton extends Animal{

    public void cri(){
        System.out.println("Le mouton bel");
    }
}
class Chien extends Animal{
    public void cri(){
        System.out.println("Le chien aboit");
    }
}
//Nous pouvons maintenant créer des objets Chat et Chien et appeler la méthode cri()
// sur les deux:
class MesAnimaux{
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal mouton = new Mouton();
        Animal chien = new Chien();

        animal.cri();
        mouton.cri();
        chien.cri();
    }

}