package com.design.Template;

/**
 * Created by lei on 15-9-29.
 */
public abstract class CoffInBeverage {

    public void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    public void boilWater(){
        System.out.println("boiling Water");
    }

    public abstract void brew();


    public void pourInCup() {
        System.out.println("pouring into cup");
    }

    public abstract void addCondiments();

    public void hook(){

    }
}
