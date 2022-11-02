package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;

    public String getEyeColor() {
        return eyeColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public String getFavColor() {
        return favColor;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public void setFavColor(String favColor) {
        this.favColor = favColor;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    private String eyeColor;
    private String hairColor;
    private String favColor;
    private int height;
    private int weight;


    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
        this.eyeColor = "";
        this.hairColor = "";
        this.favColor = "";
        this.height = Integer.MAX_VALUE;
        this.weight = Integer.MAX_VALUE;


    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {

        return age;
    }
}
