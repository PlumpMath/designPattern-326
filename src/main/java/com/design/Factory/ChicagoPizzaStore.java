package com.design.Factory;

/**
 * Created by lei on 15-9-27.
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        }else if(type.equals("veggie")){
            return new ChicagoStyleVeggiePizza();
        }
        return null;
    }
}
