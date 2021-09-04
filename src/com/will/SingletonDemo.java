package com.will;

public class SingletonDemo {
    //this is the object of this particular class that is going to be returned everytime an object is requested
    static SingletonDemo instance = null;
    public int x = 10;

    //private constructor
    //never instantiated
    private SingletonDemo(){

    }

    static public SingletonDemo getInstance(){
        if(instance == null)
            instance = new SingletonDemo();
        return instance;
    }
}
