package com.design.Factory;

/**
 * Created by lei on 15-9-27.
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type){
        Pizza pizza = null ;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        System.out.println(pizza.getName());
        return pizza;
    }
    abstract public Pizza createPizza(String type);
}
