package animal;
import java.util.ArrayList;
import java.util.List;

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