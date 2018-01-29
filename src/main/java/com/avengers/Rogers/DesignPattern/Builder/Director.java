package com.avengers.Rogers.DesignPattern.Builder;

public class Director {

    public void build(Builder builder) {

        builder.buildPartA();
        builder.buildPartB();

    }

}