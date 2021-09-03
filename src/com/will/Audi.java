package com.will;

public class Audi extends Cars {

    @Override
    void applyBrakes() {
        System.out.println("applying brakes to audi");
    }

    @Override
    void accelerate() {
        System.out.println("accelerating audi");
    }
}
