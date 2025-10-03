class Animal {
    private boolean alive = true;
    private String name;
    public void meet(Animal other) {
        if (canEat(other))
            other.eaten();
        else if (other.canEat(this))
            eaten();
    }
    public void eaten() {
        alive = false;
    }
    public boolean canEat(Animal other) {
        return false;
    }
    public boolean isAlive() {
        return alive;
    }

    public String getName() {
        return name;
    }
    protected void setName(String name) {
        this.name = name;
    }
}
class Mouse extends Animal {
    public Mouse(String name) {
        setName(name);
    }
}
class Cat extends Animal {
    public Cat(String name) {
        setName(name);
    }
    public boolean canEat(Animal animal) {
        return isAlive() && animal instanceof Mouse;
    }
}
class Tiger extends Cat {
    public Tiger(String name) {
        super(name);
    }
    public boolean canEat(Animal animal) {
        return isAlive() && (super.canEat(animal) || !(animal instanceof Tiger));
    }
}
Mouse m = new Mouse("Mouse1");
Cat cat = new Cat("Cat1");
Tiger tiger1 = new Tiger("Tiger1");
Tiger tiger2 = new Tiger("Tiger2");
Animal[] animals = new Animal[] { m, cat, tiger1, tiger2 };
m.meet(tiger1);
tiger1.meet(cat);
cat.meet(tiger2);
tiger2.meet(tiger1);
for (int i = 0; i < animals.length; i++) {
        System.out.print(animals[i].getName() + " is ");
        if (animals[i].isAlive()) System.out.println("alive");
        else System.out.println("dead");
}