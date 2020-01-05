package com.homework10;

public class LiquidState implements State {
    public void doAction(Water water) {
        System.out.println("Water is in solid state");
        water.setState(this);
    }

    public String toString(){
        return "Liquid State";
    }
}
