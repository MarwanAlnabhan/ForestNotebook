package be.intecbrussel.entities.plant_entities;

public class Tree extends Plant {

    private LeafType leafType;

    public Tree(String name) {
        super(name);
    }

    public Tree(String name, Double height) {
        super(name, height);
    }

    public Tree(String name, double height, LeafType leafType) {
        super(name, height);
        this.leafType = leafType;
    }

    public LeafType getLeafType() {
        return leafType;
    }

    public void setLeafType(LeafType leafType) {
        this.leafType = leafType;
    }

    @Override
    public String toString() {
        return "Tree " + getName() + " with height " + getHeight() + " with leaf type " + leafType.name();
    }


		
	}


