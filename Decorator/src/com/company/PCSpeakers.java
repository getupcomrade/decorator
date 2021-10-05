package com.company;

public class PCSpeakers extends  PCDecorator{
    public PCSpeakers(PC computer) {
        super(computer);
    }

    @Override
    public int getCost() {
        return super.getCost()+8500;
    }
    @Override
    public String getDesc(){
        return super.getDesc()+", Speakers";
    }
}
