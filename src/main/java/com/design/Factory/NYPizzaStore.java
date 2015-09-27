package com.design.Factory;

/**
 * Created by lei on 15-9-27.
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new NYStyleCheesePizza();
        }else if(type.equals("veggie")){
            return new NYStyleVeggiePizza();
        }
        return null;
    }
}
