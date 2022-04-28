package com.company;

public class massageList {

    private static final int MESSAGE_NUMBER = 10;
    private static final String[] MASSAGE = new String[MESSAGE_NUMBER];

    public static String massageDB(int idx){
        MASSAGE[0] = "Massage 0";
        MASSAGE[1] = "Massage 1";
        MASSAGE[2] = "Massage 2";
        MASSAGE[3] = "Massage 3";
        MASSAGE[4] = "Massage 4";
        MASSAGE[5] = "Massage 5";
        MASSAGE[6] = "Massage 6";
        MASSAGE[7] = "Massage 7";
        MASSAGE[8] = "Massage 8";
        MASSAGE[9] = "Massage 9";
        return MASSAGE[idx];
    }

    public static int GET_MESSAGE_NUMBER(){
        return MESSAGE_NUMBER;
    }
}
