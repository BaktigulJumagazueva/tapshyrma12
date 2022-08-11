package com.company;

public class Dog {
    private String name;
    private int age;
    private String breed;
    private int weight;


    public Dog(String name, int age,String breed, int weight) {
        this.name=name;
        this.age = age;
        this.breed=breed;
        this.weight=weight;


    }
    public Dog(){

    }
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
