package be.intecbrussel.entities.plant_entities;


import java.util.Objects;

public abstract class Plant {

    private String name;
    private double height;

    public Plant(String name) {
        this.name = name;
    }

    public Plant(String name, double height) {
        this(name);
        setHeight(height);
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = Math.abs(height);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plant plant = (Plant) o;
        return name.equals(plant.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }


    @Override
    public String toString() {
        return "Plant " + name + " with height " + height;
    }
}

