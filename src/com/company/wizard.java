package com.company;

public class wizard extends human {

    private String job = "Wizard";
    private double hp = super.getHp() + 10;
    private double sp = super.getSp() + 20;
    private double intStat = super.getIntStat() + 10;
    private double dexStat = super.getDexStat() + 5;
    private double stringStat = super.getStringStat() + 5;
    private double luck = super.getLuck() + 2;

    public wizard(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public static void fireBall(){
        System.out.println("FireBall!");
    }

    public static void fireWall(){
        System.out.println("FireWall!");
    }

    @Override
    public String toString() {
        return "wizard{" +
                "job='" + job + '\'' +
                ", hp=" + hp +
                ", sp=" + sp +
                ", intStat=" + intStat +
                ", dexStat=" + dexStat +
                ", stringStat=" + stringStat +
                ", luck=" + luck +
                '}';
    }
}
