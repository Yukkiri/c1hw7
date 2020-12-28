package com.company;

public class Plate {
    private int value;

    Plate(int value){
        this.value = Math.max(value, 0);
    }

    public int getValue() {
        System.out.println("Еды в тарелке: " + value);
        return value;
    }

    public void setValue(int value) {
        this.value = Math.max(value, 0);
    }

    public void addFood(int food){
        value += food;
    }

    public boolean eatingCat(int appetite){
        if (appetite > value)
            return false;
        else{
            value -= appetite;
            return true;
        }
    }
}
