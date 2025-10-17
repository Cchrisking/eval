package animal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Zoo {
    public static void main(String[] args) {
        Mouse m = new Mouse("Jerry");
        Cat cat = new Cat("Azrael");
        Tiger tiger1 = new Tiger("Tiger1");
        Tiger tiger2 = new Tiger("Tiger2");
        Animal[] animals = new Animal[]{m, cat, tiger1, tiger2};
        m.meet(tiger1);
        tiger1.meet(cat);
        cat.meet(tiger2);
        tiger2.meet(tiger1);
        System.out.println("------------------------------------");
        for (int i = 0; i < animals.length; i++) {
            System.out.print(animals[i].getName() + " is ");
            if (animals[i].isAlive()) System.out.println("alive");
            else System.out.println("dead");
        }
        System.out.println("B");
        System.out.println("------------------------------------");
        // 3
        List<Animal> aanimals = new ArrayList<Animal>();
        aanimals.add(m);
        aanimals.add(cat);
        aanimals.add(tiger1);
        aanimals.add(tiger2);
        //4 supprimer etat dead
        //mauvaise aproche mais j'accepte l'idee'
        for (int i = 0; i < aanimals.size(); i++) {
            if (!aanimals.get(i).isAlive()){
                //aanimals.remove(i);
            }
        }
        //une autre mauvaise aproche mais j'accpte l'idee ;
        for (Animal a: aanimals) {
            if (!a.isAlive()){
                //aanimals.remove(a);
            }
        }
        //meilleur aproche parcours decroisant
        for (int i = animals.length - 1; i >= 0; i--){
            if (!aanimals.get(i).isAlive()){
                //aanimals.remove(i);
            }
        }
        //très bonne aproche avec iterator mais non aborder en cours
        Iterator<Animal> iterator = aanimals.iterator();
        while (iterator.hasNext()){
            if (!iterator.next().isAlive()){
                iterator.remove();
            }
        }
        // une autre approche avec iterator interne

    }
}
