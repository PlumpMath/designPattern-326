package com.design.Factory;

/**
 * Created by lei on 15-9-27.
 */
public class NewCheesePizza extends NewPizza {
    private PizzaIngredientFactory ingredientFactory;

    @Override
    public void prepare() {
        setDough(ingredientFactory.createDough().toString());
        setSauce(ingredientFactory.createSauce().toString());
        System.out.println("Preparing " + getName());
        System.out.println("Tossing dough");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
    }

    public NewCheesePizza() {
    }

    public NewCheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public PizzaIngredientFactory getIngredientFactory() {
        return ingredientFactory;
    }

    public void setIngredientFactory(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

}
