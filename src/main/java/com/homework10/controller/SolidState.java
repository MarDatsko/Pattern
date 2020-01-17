package main.java.com.homework10.controller;

import main.java.com.homework10.model.State;
import main.java.com.homework10.model.Water;

public class SolidState implements State {
    public void doAction(Water water) {
        System.out.println("Water is in solid state");
        water.setState(this);
    }

    public String toString(){
        return "Solid State";
    }
}
