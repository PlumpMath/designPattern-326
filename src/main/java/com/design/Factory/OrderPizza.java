package com.design.Factory;

/**
 * Created by lei on 15-9-27.
 */
public class OrderPizza {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        nyPizzaStore.orderPizza("cheese");
        chicagoStore.orderPizza("veggie");
    }
}
