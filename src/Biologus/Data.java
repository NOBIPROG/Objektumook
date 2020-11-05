package Biologus;

import Indiánok.Indián;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Data {
    List<Animal> animals = animals();


    public Data() throws FileNotFoundException {
    }

    public List<Animal> animals() throws FileNotFoundException {
        Scanner sk= new Scanner(new File("Files/foldresz.txt"));
        Scanner sc = new Scanner(new File("Files/animals.txt"));
        List<Animal> animals = new ArrayList<>();
        while (sc.hasNextLine()) {
            String[] splitit = sc.nextLine().split(",");
            double avgWeight = Double.parseDouble(splitit[2]);
            double maxSpeed = Double.parseDouble(splitit[3]);
            double avgAge = Double.parseDouble(splitit[4]);
            animals.add(new Animal(splitit[0], splitit[1], avgWeight, maxSpeed, avgAge));
        }
        while (sk.hasNextLine()){
          String[] species=sk.nextLine().split(",",2);
         String []continents= species[1].split(",");
            for (Animal animal:animals){
                if(animal.getSpecies().equals(species[0])){
                    animal.setContinents(continents);
                }
            }
        }
        return animals;

    }


    public void fastestAnimal(List<Animal> animals) {
        comparatorBySpeed comparator = new comparatorBySpeed();

        Collections.sort(animals, comparator);
        System.out.println("A három leggyorsabb állat: " + animals.get(0) + animals.get(1) + animals.get(2));
    }

    public void fastestAnimalByType(List<Animal> animals) {
        comparatorByMaxSpeedAndType comparator = new comparatorByMaxSpeedAndType();
        //comparatorBySpeed comparator = new comparatorBySpeed();
        Collections.sort(animals, comparator);
        int counter = 0;
        for (Animal animal : animals) {
            if (animal.getType().equals("szárazföldi") && counter < 3) {
                System.out.println("A(z)"+(counter+1)+". leggyorsabb szárazföldi a(z) "+animal.getSpecies());
                counter++;
            }
        }
    }
    public void fastestAnimalByContinent(List<Animal> animals) {
       // comparatorByMaxSpeedAndType comparator = new comparatorByMaxSpeedAndType();
        comparatorBySpeed comparator = new comparatorBySpeed();
        Collections.sort(animals, comparator);
        int counter = 0;
        for (Animal animal : animals) {
            if (animal.getContinents().contains("Európa") && counter < 3) {
                System.out.println("A(z)"+(counter+1)+". leggyorsabb európai a(z) "+animal.getSpecies());
                counter++;
            }
        }
    }
}


