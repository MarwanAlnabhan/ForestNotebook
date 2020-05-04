package be.intecbrussel.entities.plant_entities;

public class Bush extends Plant {

    private String fruit;
    private LeafType leafType;

    public Bush(String name) {
        super(name);
    }

    public Bush(String name, Double height) {
        super(name, height);
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public LeafType getLeafType() {
        return leafType;
    }

    public void setLeafType(LeafType leafType) {
        this.leafType = leafType;
    }

    @Override
    public String toString() {
        return "Bush " + getName() + " with height " + getHeight() + " fruit " + fruit + " and leaf type " + leafType.name();
    }
}

