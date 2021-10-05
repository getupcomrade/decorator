package com.company;

public class SystemUnit implements PC {
    @Override
    public int getCost() {
        return 100000;
    }
    @Override
    public String getDesc() {
        return "System unit";
    }
}
