package be.intecbrussel.entities.animal_entities;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import be.intecbrussel.entities.plant_entities.Plant;

public class Herbivore extends Animal {

    private Set<Plant> plantDiet = new HashSet<>();

    public Herbivore(String name) {
        super(name);
    }

    public Herbivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

    public Set<Plant> getPlantDiet() {
        return plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    public void addPlantDiet(final Plant plant) {
        plantDiet.add(plant);
    }

    public void printDiet() {
        for (Plant plant : plantDiet) {
            System.out.println(plant);
        }
    }

    @Override
    public String toString() {
        return "Herbivore " + getName() + " with height " + getHeight() + " plant diet " + Arrays.toString(plantDiet.toArray());
    }
}

