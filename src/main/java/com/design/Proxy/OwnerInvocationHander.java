package com.design.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by lei on 15-10-24.
 */
public class OwnerInvocationHander implements InvocationHandler {
    private PersonInterface person;

    public OwnerInvocationHander() {
    }

    public OwnerInvocationHander(PersonInterface person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object object, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {
        System.out.println("proxy invoke ...");
        if(method.getName().startsWith("get")){
            return method.invoke(person, args);
        } else if(method.getName().equals("setHotOrNotRating")) {
            throw new IllegalAccessException();
        } else if(method.getName().startsWith("set")) {
            return method.invoke(person, args);
        }

        return null;
    }
}
