package com.company;

public class Main {

    public static void main(String[] args) {
    PC systemUnit = new SystemUnit();
        System.out.println("You have chosen: "+ systemUnit.getDesc() + ".\nTotal price:"+systemUnit.getCost()+" tg.\n");

    PC computerWithMonitor = new PCMonitor(new SystemUnit());
        System.out.println("You have chosen: "+ computerWithMonitor.getDesc()+".\nTotal price:"+computerWithMonitor.getCost()+" tg.\n");

    PC fullComputer= new PCKeyboard(new PCSpeakers(new Windows10key(new PCMonitor(new SystemUnit()))));
        System.out.println("You have chosen: "+ fullComputer.getDesc()+".\nTotal price:"+fullComputer.getCost()+" tg.\n");

    PC pcwindows = new Windows10key(new SystemUnit());
        System.out.println("You have chosen: "+ pcwindows.getDesc()+".\nTotal price:"+pcwindows.getCost()+" tg.\n");
        

    }
}
