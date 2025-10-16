package animal;

class Tiger extends Cat {
    public Tiger(String name) {
        super(name);
    }
    public boolean canEat(Animal animal) {
        return isAlive() && (super.canEat(animal) || !(animal instanceof Tiger));
    }
}
