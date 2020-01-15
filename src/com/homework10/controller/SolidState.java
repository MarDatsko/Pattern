package com.homework10.controller;

import com.homework10.model.State;
import com.homework10.model.Water;

public class SolidState implements State {
    public void doAction(Water water) {
        System.out.println("Water is in solid state");
        water.setState(this);
    }

    public String toString(){
        return "Solid State";
    }
}
