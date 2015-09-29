package com.design.Adapter;

/**
 * Created by lei on 15-9-29.
 */
public class DuckTestDrive {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Turkey wildTurkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);
        System.out.println("The turkey says");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("The Duck says");
        mallardDuck.quack();
        mallardDuck.fly();

        System.out.println("The TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    public static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
