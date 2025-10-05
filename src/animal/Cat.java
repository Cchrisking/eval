package animal;

class Cat extends Animal {
    public Cat(String name) {
        setName(name);
    }
    public boolean canEat(Animal animal) {
        return isAlive() && animal instanceof Mouse;
    }
}