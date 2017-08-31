package com.tiy;

abstract class Soldier {
    String name;
    String rank;
    Integer serialNumber;
    String snore;
    String chew;
    String trudge;





    public String sleep(){
        System.out.println("snore");
        return snore;
    }
    public String eat(){
        System.out.println("chew");
        return chew;
    }
    public String walk(){
        System.out.println("trudge");
        return trudge;

    }
    abstract String speak();


}
