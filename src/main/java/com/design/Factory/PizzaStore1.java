package com.design.Factory;

/**
 * Created by lei on 15-9-27.
 */
public class PizzaStore1 {
    private SimplePizzaFactory factory;

    public PizzaStore1() {
    }

    public PizzaStore1(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore1 pizzaStore1 = new PizzaStore1(factory);
        pizzaStore1.orderPizza("cheese");
    }
}
