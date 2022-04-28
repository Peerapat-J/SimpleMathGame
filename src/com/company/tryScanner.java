package com.company;

import java.util.Scanner;

public class tryScanner {

    public String getText(){
        System.out.println("Say some thing human...: ");
        Scanner scanner = new Scanner(System.in);
        String ipInt = scanner.next();
        scanner.close();
        return ipInt;
    }




}
