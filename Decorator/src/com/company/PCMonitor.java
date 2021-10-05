package com.company;

public class PCMonitor extends  PCDecorator{
    public PCMonitor(PC computer) {
        super(computer);
    }

    @Override
    public int getCost() {
        return super.getCost()+35000;
    }
    @Override
    public String getDesc(){
        return super.getDesc()+", Monitor";
    }
}
