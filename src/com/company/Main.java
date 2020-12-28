package com.company;

public class Main {

    public static void main(String[] args) {
	    Plate plate = new Plate(500);
	    Cat[] cats = new Cat[6];
	    cats[0] = new Cat("Barsik", 100);
	    cats[1] = new Cat("Murzik", 70);
	    cats[2] = new Cat("Albina", 90);
	    cats[3] = new Cat("Kuzya", 80);
	    cats[4] = new Cat("Zira", 30);
	    cats[5] = new Cat("Tiger", 400);
        plate.getValue();

        for (Cat cat: cats) {
            if(!cat.isSatiety())
                cat.eat(plate);
            System.out.println("Сытость кота: " + cat.isSatiety());
        }

        plate.getValue();
        plate.addFood(350);
        plate.getValue();
    }

    //useless comment
}
