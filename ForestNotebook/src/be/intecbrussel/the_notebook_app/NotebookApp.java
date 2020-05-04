package be.intecbrussel.the_notebook_app;


import java.util.HashSet;
import java.util.Set;

import be.intecbrussel.entities.animal_entities.Carnivore;
import be.intecbrussel.entities.animal_entities.Herbivore;
import be.intecbrussel.entities.animal_entities.Omnivore;
import be.intecbrussel.entities.plant_entities.Bush;
import be.intecbrussel.entities.plant_entities.Flower;
import be.intecbrussel.entities.plant_entities.LeafType;
import be.intecbrussel.entities.plant_entities.Plant;
import be.intecbrussel.entities.plant_entities.Scent;
import be.intecbrussel.entities.plant_entities.Tree;
import be.intecbrussel.entities.plant_entities.Weed;
import be.intecbrussel.entities.services_entities.Notebook;

public class NotebookApp {

    public static void main(String[] args) {
        Notebook notebook = new Notebook();

        

        
        Bush plant_Bush1=new Bush("Hortensia", 1.2);
        plant_Bush1.setLeafType(LeafType.HEART);
        plant_Bush1.setFruit("Ananas");
        notebook.addPlant(plant_Bush1);
        
        Bush plant_Bush2=new Bush("Dwergsering", 0.8);
        plant_Bush2.setLeafType(LeafType.HEART);
        plant_Bush2.setFruit("Oranje");
        notebook.addPlant(plant_Bush2);
    
        Flower plant_Flower1 = new Flower("Helleborus", 10.4);
        plant_Flower1.setSmell(Scent.EARTHY);
        notebook.addPlant(plant_Flower1);
      
        Flower plant_Flower2 = new Flower("Hydrangea", 1.2);
        plant_Flower2.setSmell(Scent.EARTHY);
        notebook.addPlant(plant_Flower2);
        
        Weed plant_Weed1 = new Weed("Trifulium", 0.2);
        plant_Weed1.setArea(1.50);
        notebook.addPlant(plant_Weed1);
        
        Tree plant_Tree1=new Tree("Oak", 7.0);
        plant_Tree1.setLeafType(LeafType.HAND);
        notebook.addPlant(plant_Tree1);
        
        Tree plant_Tree2=new Tree("Elm", 25.0);
        plant_Tree2.setLeafType(LeafType.HAND);
        notebook.addPlant(plant_Tree2);
        
        Tree plant_Tree3=new Tree("Pijnboombit", 50.0);
        plant_Tree3.setLeafType(LeafType.NEEDLE);
        notebook.addPlant(plant_Tree3);
        
        Set<Plant>deitPlants= new HashSet<>();
        deitPlants.add(plant_Bush1);
        deitPlants.add(plant_Flower1);
        deitPlants.add(plant_Tree1);
        
        Herbivore herbivore1 = new Herbivore ("Olifant",4000,3.2,4.0);
        herbivore1.setPlantDiet(deitPlants);
        notebook.addAnimal(herbivore1);
        notebook.getHerbivores().add(herbivore1);
        
        Herbivore herbivore2 = new Herbivore ("Okapi",200,1.5,2.0);
        herbivore2.setPlantDiet(deitPlants);
        notebook.addAnimal(herbivore2);
        notebook.getHerbivores().add(herbivore2);
        
        Herbivore herbivore3 = new Herbivore ("Impala",40,0.9,1.4);
        herbivore3.setPlantDiet(deitPlants);
        notebook.addAnimal(herbivore3);
        notebook.getHerbivores().add(herbivore3);
        
    
        Carnivore carnivore1 = new Carnivore ("Tijger",220,1.1,3.0);
        carnivore1.setMaxFoodSize(10);
        notebook.addAnimal(carnivore1);
        
        
        Carnivore carnivore2 = new Carnivore ("Leopard",60,0.9,1.30);
        carnivore2.setMaxFoodSize(10);
        notebook.addAnimal(carnivore2);
        
        
        Carnivore carnivore3 = new Carnivore ("Kat",5.0,0.25,0.65);
        carnivore3.setMaxFoodSize(10);
        notebook.addAnimal(carnivore3);
        
        
        Omnivore omnivore1 = new Omnivore ("Fox",14.0,0.5,0.9);
        omnivore1.setMaxFoodSize(10);
        omnivore1.setPlantDiet(deitPlants);
        notebook.addAnimal(omnivore1);
        ;
        
        Omnivore omnivore2 = new Omnivore ("Egel",1.2,0.12,0.3);
        omnivore2.setMaxFoodSize(10);
        omnivore2.setPlantDiet(deitPlants);
        notebook.addAnimal(omnivore2);
        
        
        Omnivore omnivore3 = new Omnivore ("Beer",450,2.1,3.0);
        omnivore3.setMaxFoodSize(10);
        omnivore3.setPlantDiet(deitPlants);
        notebook.addAnimal(omnivore3);
      
       
      

        System.out.println("Number of animals in the notebook : " + notebook.getAnimalCount());
        System.out.println("Number of plants in the notebook : " + notebook.getPlantCount());

        notebook.printNoteBook();

        System.out.println("Carnivores: ");
        for (Carnivore c : notebook.getCarnivores()) {
            System.out.println(c);
        }

        System.out.println("Omnivores: ");
        for (Omnivore o : notebook.getOmnivores()) {
            System.out.println(o);
        }

        System.out.println("Carnivores: ");
        for (Herbivore h : notebook.getHerbivores()) {
            System.out.println(h);
        }

        System.out.println("Plants: ");
        for (Plant p : notebook.getPlants()) {
            System.out.println(p);
        }

    }

}

