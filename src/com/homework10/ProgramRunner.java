package com.homework10;

public class ProgramRunner {
    public void runProgram() {
        Water water = new Water();

        LiquidState liquid = new LiquidState();
        liquid.doAction(water);
        System.out.println(water.getState().toString());

        SolidState solid = new SolidState();
        solid.doAction(water);
        System.out.println(water.getState().toString());
    }
}

