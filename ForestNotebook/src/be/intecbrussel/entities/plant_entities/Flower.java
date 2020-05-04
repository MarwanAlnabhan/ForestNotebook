package be.intecbrussel.entities.plant_entities;

public class Flower extends Plant {

    private Scent smell;

    public Flower(String name) {
        super(name);
    }

    public Flower(String name, Double height) {
        super(name, height);
    }

    public Scent getSmell() {
        return smell;
    }

    public void setSmell(Scent smell) {
        this.smell = smell;
    }

    @Override
    public String toString() {
        return "Flower " + getName() + " with height " + getHeight() + " smell " + smell.name();
    }
}

