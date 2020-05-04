package be.intecbrussel.entities.animal_entities;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import be.intecbrussel.entities.plant_entities.Plant;

public class Omnivore extends Animal {

    private Set<Plant> plantDiet = new HashSet<>();
    private double maxFoodSize;

    public Omnivore(String name) {
        super(name);
    }

    public Omnivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

    public Set<Plant> getPlantDiet() {
        return plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }

    public void addPlantDiet(final Plant plant) {
        plantDiet.add(plant);
    }

    @Override
    public String toString() {
        return "Omnivore " + getName() + " with height " + getHeight() + " plant diet " + Arrays.toString(plantDiet.toArray()) + " max food size " + maxFoodSize;
    }
}

