package com.tiy;

public class Army extends Soldier implements Wrestle{
    public Army(String warCry) {
        this.warCry = "hoaah";
    }

    private String warCry;





    @Override
    String speak() {
        return warCry;
    }

    @Override
    public void bodySlam() {

        System.out.println("boooooooooooooom");

    }

    @Override
    public void chokeSlam() {
        System.out.println("crasssshhhh");

    }

    @Override
    public void stoneColdStunna() {
        System.out.println("glass breaking");

    }

    @Override
    public void rockBottom() {
        System.out.println("eyebrow raise");

    }

    @Override
    public void pedigree() {

    }

    @Override
    public void sweetChinMusic() {
        System.out.println("boom boom bam");

    }

    @Override
    public void wallsOfJericho() {

    }

    @Override
    public void olympicSlam() {

    }

    @Override
    public void tombStone() {

    }
}
