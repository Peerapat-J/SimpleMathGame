package com.company;

import java.util.ArrayList;

public class Programmer extends Employee{

    private String skill = "Write code";

    public Programmer(String firstName, String lastName, int age, int salary) {
        super(firstName, lastName, age, salary);
    }

    public String getSkill() {
        return skill;
    }
}
