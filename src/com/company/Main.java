package com.company;

public class Main {
    public static void main(String[] args) {
        Fish fish = new Fish("Flaunder", 3, "paltus", 2);
        System.out.println(fish.getName());
        System.out.println(fish.getAge());
        System.out.println(fish.getBreed());
        System.out.println(fish.getWeight());
        System.out.println("----------------------------------------------------");
        Cat cat = new Cat("Tom", 7, "mein-kun", 5);
        System.out.println(cat.getName());
        System.out.println(cat.getAge());
        System.out.println(cat.getBreed());
        System.out.println(cat.getWeight());
        System.out.println("------------------------------------------------------");

        Dog dog = new Dog("Rex", 6, "shepherd dog", 20);
        System.out.println(dog.getName());
        System.out.println(dog.getAge());
        System.out.println(dog.getBreed());
        System.out.println(dog.getWeight());
        System.out.println("--------------------------------------------------------");

        Parrot parrot = new Parrot("Kecha",8,"jako",1);
        System.out.println(parrot.getName());
        System.out.println(parrot.getAge());
        System.out.println(parrot.getBreed());
        System.out.println(parrot.getWeight());
    }
}

