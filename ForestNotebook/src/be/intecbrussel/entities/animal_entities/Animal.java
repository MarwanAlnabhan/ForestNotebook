package be.intecbrussel.entities.animal_entities;

import java.util.Objects;

public abstract class Animal {

    private final String name;
    private double weight;
    private double height;
    private double length;

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, double weight, double height, double length) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.length = length;
    }

    public String getName() {
        return name;
    }


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = Math.abs(weight);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = Math.abs(height);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = Math.abs(length);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return name.equals(animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Animal " + name + " with height " + height;
    }
}

