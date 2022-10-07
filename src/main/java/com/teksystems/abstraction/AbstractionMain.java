package com.teksystems.abstraction;

public class AbstractionMain {

    public static void main(String[] args) {
        
        System.out.println("===================== cat ==================");
        Cat cat = new Cat();
        cat.animalSound();
        cat.animalEats();
        cat.animalLocation();
        cat.animalName();
        
        System.out.println("===================== dog ==================");
        
        Animal dog = new Dog();
        dog.animalSound();
        dog.animalEats();
        
        System.out.println("===================== pig ==================");
        Animal pig = new Pig();
        pig.animalSound();
        pig.animalEats();
        
        System.out.println("===================== fish =================");
        AnimalInterface fish = new Fish();
        fish.animalLocation();
        fish.animalName();
    }
}
