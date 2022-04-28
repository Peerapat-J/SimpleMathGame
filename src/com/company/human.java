package com.company;

public class human {
    private String firstName;
    private String lastName;
    private int age;
    private double hp = 10;
    private double sp = 0;
    private double intStat = 1;
    private double dexStat = 10;
    private double stringStat = 10;
    private double luck = 0;

    public human(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName.substring(0, 1).toUpperCase() +
                firstName.substring(1).toLowerCase();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName.substring(0, 1).toUpperCase() +
                lastName.substring(1).toLowerCase();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else this.age = 1;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getSp() {
        return sp;
    }

    public void setSp(double sp) {
        this.sp = sp;
    }

    public double getIntStat() {
        return intStat;
    }

    public void setIntStat(double intStat) {
        this.intStat = intStat;
    }

    public double getDexStat() {
        return dexStat;
    }

    public void setDexStat(double dexStat) {
        this.dexStat = dexStat;
    }

    public double getStringStat() {
        return stringStat;
    }

    public void setStringStat(double stringStat) {
        this.stringStat = stringStat;
    }

    public double getLuck() {
        return luck;
    }

    public void setLuck(double luck) {
        this.luck = luck;
    }
    public static void greeting() {
        System.out.println("Hi!");
    }

    public static void bye() {
        System.out.println("Good luck!");
    }

    public static void ask() {
        System.out.println("Do you...(ask something)");
    }

    @Override
    public String toString() {
        return "human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", hp=" + hp +
                ", sp=" + sp +
                ", intStat=" + intStat +
                ", dexStat=" + dexStat +
                ", stringStat=" + stringStat +
                ", luck=" + luck +
                '}';
    }

    public void showStat() {
        System.out.println(this.toString());
    }
}
