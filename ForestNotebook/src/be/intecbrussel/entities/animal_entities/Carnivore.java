package be.intecbrussel.entities.animal_entities;

import java.util.Set;

import be.intecbrussel.entities.plant_entities.Plant;

public class Carnivore extends Animal {

    private double maxFoodSize;

    public Carnivore(String name) {
        super(name);
    }

    public Carnivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }

    @Override
    public String toString() {
        return "Carnivore " + getName() + " with height " + getHeight() + " max food size " + maxFoodSize;
    }

	
		
	
}
