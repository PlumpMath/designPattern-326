package com.design.Proxy;

import java.lang.reflect.Proxy;

/**
 * Created by lei on 15-10-24.
 */
public class Person implements PersonInterface {
    private String name;
    private Integer age;
    private String interests;

    public Person() {
    }

    public Person(String name, Integer age, String interests) {
        this.name = name;
        this.age = age;
        this.interests = interests;
    }

    public PersonInterface getOwnerProxy(PersonInterface person) {
        return (PersonInterface) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), new OwnerInvocationHander(person));
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getInterests() {
        return interests;
    }

    public void setInterests(String interests) {
        this.interests = interests;
    }
}
