package com.suxia.abandon.ref;

public class PeopleFactory<T extends People> implements AbPeopleFactory {


    @Override
    public People getPeopleByClassName(String className) {
        try {
            Class<T> c = (Class<T>) Class.forName(className,true,ClassLoader.getSystemClassLoader());
            People people = c.newInstance();
            return people;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    @Override
    public People getHireByClassName(String className) {
        try {
            ClassLoader loader = ClassLoader.getSystemClassLoader();
            Class<?> c = loader.loadClass(className);
            People people = (People) c.newInstance();
            return people;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
