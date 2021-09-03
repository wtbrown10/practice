package com.will;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        int counter = 10, hold = 1;
//
//        while (counter < 15) {
//            System.out.println("I love Java");
//            counter ++;
//        }
//
//        System.out.println("Out of while loop!");
//    }
//        while (counter > 1) {
//            hold *= counter;
//            System.out.println(/*"5*"+ counter + " = " +*/ hold);
//            counter--;
//
//        }
//
//        Scanner sc = new Scanner(System.in);
//
//        String response;
//        do {
//            System.out.println("Enter a whole number between 1 and 50");
//            int number1 = sc.nextInt();
//            System.out.println("Enter another whole number between 1 and 50");
//            int number2 = sc.nextInt();
//            int add = (number2 + number1);
//            System.out.println(number2  + " + "  + number1 + " = " + add);
//            System.out.println("would you like to to perform operation again? Type (Yes) or (No)");
//            response = sc.next();
//        } while (response.equals("Yes"));
//        System.out.println("done!");

//        Car ferrari = new Car("Ferrari F430", "red", 4);
//        ferrari.display();
//
//        Car tesla = new Car("Model X", "Light Blue", 4);
//        tesla.display();

        Dog dog = new Dog();
        dog.walk();
        dog.bark();
    }
}
