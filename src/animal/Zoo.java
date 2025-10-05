package animal;

import java.util.ArrayList;
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
        for (int i = 0; i < animals.length; i++) {
            System.out.print(animals[i].getName() + " is ");
            if (animals[i].isAlive()) System.out.println("alive");
            else System.out.println("dead");
        }
        // 3
        List<Animal> aanimals = new ArrayList<Animal>();
        aanimals.add(m);
        aanimals.add(cat);
        aanimals.add(tiger1);
        aanimals.add(tiger2);
        //4 supprimer etat dead
        for (int i = 0; i < aanimals.size(); i++) {
            if (!aanimals.get(i).isAlive()){
                System.out.println(aanimals.get(i).getName()+" Is dead");
                //aanimals.remove(i);
            }
        }
        for (Animal a: aanimals) {
            if (!a.isAlive()){
                System.out.println(a.getName()+" Is removed");
                //aanimals.remove(a);
            }
        }
    }
}
