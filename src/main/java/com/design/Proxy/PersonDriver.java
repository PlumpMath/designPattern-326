package com.design.Proxy;

/**
 * Created by lei on 15-10-24.
 */
public class PersonDriver {
    public static void main(String[] args) {
        Person person = new Person("leilei", 12, "music");
        System.out.println(person.getAge());
        System.out.println(person.getName());
        PersonInterface p2 = new Person().getOwnerProxy(person);
        p2.getAge();
        p2.setAge(10);
    }
}
