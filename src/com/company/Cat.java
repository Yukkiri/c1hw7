package com.company;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public void eat(Plate plate){
        System.out.println("Кот пытается поесть...");
        if(plate.eatingCat(appetite)){
            appetite = 0;
            satiety = true;
        }
    }
}
