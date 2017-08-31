package com.tiy;

public class Navy extends Soldier implements HandToHand {
    public Navy(String warCry) {
        this.warCry = "hooyah";
    }

    String warCry;
    @Override
    String speak() {
        return warCry;
    }

    @Override
    public void jab() {
        System.out.println("bam");

    }

    @Override
    public void hook() {
        System.out.println("woosh boom");

    }

    @Override
    public void uppercut() {

    }

    @Override
    public void combo() {

    }
}
