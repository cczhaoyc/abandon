package com.suxia.abandon.ref;

import java.lang.reflect.Field;

public class RefDemo {

    public static void main(String[] args) throws Exception {

        PeopleFactory factory = new PeopleFactory();
        String className = "com.suxia.abandon.ref.Man";

        People boy =  factory.getPeopleByClassName(className);
        boy.say();

        People people = factory.getHireByClassName(className);
        people.say();

    }


}
