package com.company;

public abstract class PCDecorator implements PC {
    protected PC computer;

    public PCDecorator(PC computer){
        this.computer=computer;
    }

    @Override
    public int getCost() {
        return computer.getCost();
    }

    @Override
    public String getDesc(){
        return computer.getDesc();
    }
}
