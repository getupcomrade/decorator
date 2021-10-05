package com.company;

public class PCKeyboard extends PCDecorator{
    public PCKeyboard(PC computer) {
        super(computer);
    }
    @Override
    public int getCost() {
        return super.getCost()+10000;
    }
    @Override
    public String getDesc(){
        return super.getDesc()+", Keyboard + Mouse";
    }
}
