package com.company;


public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{new Cat(), new Dog()};
        for (Animal animal : animals)
            animal.run();
    }
}
