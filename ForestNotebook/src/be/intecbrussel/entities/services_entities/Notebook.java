package be.intecbrussel.entities.services_entities;

import java.util.*;

import be.intecbrussel.entities.animal_entities.*;
import be.intecbrussel.entities.plant_entities.*;

public class Notebook {

    private int plantCount;
    private int animalCount;

    private List<Animal> animals = new ArrayList<>();
    private List<Plant> plants = new ArrayList<>();
    private List<Carnivore> carnivores = new ArrayList<>();
    private List<Omnivore> omnivores = new ArrayList<>();
    private List<Herbivore> herbivores = new ArrayList<>();

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public List<Plant> getPlants() {
        return plants;
    }

    public void setPlants(List<Plant> plants) {
        this.plants = plants;
    }

    public void addAnimal(final Animal animal) {

        if (!animals.contains(animal)) {
            animals.add(animal);
            if (animal instanceof Carnivore) {
                carnivores.add((Carnivore) animal);
            } else if (animal instanceof Omnivore) {
                omnivores.add((Omnivore) animal);
            } else if (animal instanceof Herbivore) {
                herbivores.add((Herbivore) animal);
            }
            animalCount++;
        }

    }

    public void addPlant(final Plant plant) {
        if (!plants.contains(plant)) {
            plantCount++;
            plants.add(plant);
        }
    }

    public List<Carnivore> getCarnivores() {
        return carnivores;
    }

    public void setCarnivores(List<Carnivore> carnivores) {
        this.carnivores = carnivores;
    }

    public List<Omnivore> getOmnivores() {
        return omnivores;
    }

    public void setOmnivores(List<Omnivore> omnivores) {
        this.omnivores = omnivores;
    }

    public List<Herbivore> getHerbivores() {
        return herbivores;
    }

    public void setHerbivores(List<Herbivore> herbivores) {
        this.herbivores = herbivores;
    }

    public int getPlantCount() {
        return plantCount;
    }

    public int getAnimalCount() {
        return animalCount;
    }

    public void printNoteBook() {
        for (Animal a : this.animals) {
            System.out.println(a);
        }
    }

	public Object getCarnivore() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getOmnivore() {
		// TODO Auto-generated method stub
		return null;
	}

}

