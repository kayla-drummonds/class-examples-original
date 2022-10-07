package com.teksystems.abstraction;

public class Cat extends Animal implements AnimalInterface {

    @Override
    public void animalSound() {
        System.out.println("The cat makes a sound");
        
    }

    @Override
    public void animalEats() {
        System.out.println("The cat eats some food");
    }

    @Override
    public void animalLocation() {
        System.out.println("cat lives in a house");
    }

    @Override
    public void animalName() {
        System.out.println("cat");
    }

}
