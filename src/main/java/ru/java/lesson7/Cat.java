package ru.java.lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name){
        this.name = name;
        this.appetite = 15;
        this.satiety = false;
    }

    public void eat(Plate plate){
        if (plate.getFood() < appetite) {
            System.out.println("Мало еды!");
        }else {
            plate.decreaseFood(appetite);
            satiety = true;
            System.out.println(name + " поел.");
        }
    }

    public void info(){
        System.out.printf("Имя: %s; Аппетит: %d; Сытость: %s \n", name, appetite, satiety);
    }

}
