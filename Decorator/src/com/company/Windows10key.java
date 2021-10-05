package com.company;

public class Windows10key extends PCDecorator{
    public Windows10key(PC computer) {
        super(computer);
    }
    @Override
    public int getCost() {
        return super.getCost()+20000;
    }
    @Override
    public String getDesc(){
        return super.getDesc()+", Windows 10 Activation Key";
    }
}
