package com.will;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int counter = 10, hold = 1;
//
//        while (counter < 15) {
//            System.out.println("I love Java");
//            counter ++;
//        }
//
//        System.out.println("Out of while loop!");
//    }
        while (counter > 1) {
            hold *= counter;
            System.out.println(/*"5*"+ counter + " = " +*/ hold);
            counter--;

        }
    }
}
