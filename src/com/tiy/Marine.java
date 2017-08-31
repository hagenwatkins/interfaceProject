package com.tiy;

public class Marine extends Soldier implements Knife{
    public Marine(String warCry) {
        this.warCry = "oohrah";
    }

    String warCry;
    @Override
    String speak() {
        return null;
    }

    @Override
    public void verticalSlash() {

    }

    @Override
    public void forwardSlash() {

    }

    @Override
    public void reverseSlash() {

    }

    @Override
    public void verticalThrush() {

    }
}
