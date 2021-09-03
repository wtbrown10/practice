package com.will;

public class ConstructorOverloading {

    public ConstructorOverloading(){
        System.out.println("Constructor with no parameters called");
    }

    public ConstructorOverloading(int a){
        System.out.println("Constructor with one integer parameter called");
    }

    public ConstructorOverloading(int a, int b){
        System.out.println("Constructor with 2 integer parameters called");
    }

    public ConstructorOverloading(int a, String a1){
        System.out.println("Constructor with 1 integer and 1 String called");
    }


}


