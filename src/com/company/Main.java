package com.company;

import javax.sound.midi.Soundbank;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static com.company.tryBuffer.fileRead;
import static com.company.tryBuffer.runBuff;

public class Main {

    public static void main(String[] args){

            MathQuestion m = new MathQuestion();

//        final Scanner scanner = new Scanner(System.in);
//        System.out.println("Your answer (A/a - d/D):");
//        boolean correctness = false;
//        String getKey = scanner.nextLine();
//        while(correctness != true) {
//            if (getKey.length() == 1){
//                if (getKey.toLowerCase().equals("a") ||
//                getKey.toLowerCase().equals("b") ||
//                getKey.toLowerCase().equals("c") ||
//                getKey.toLowerCase().equals("d"))
//                {
//                    correctness = true;
//                }
//            }
//            if (correctness == false){
//                System.out.println("Your answer is invalid, try again");
//                System.out.println("Your answer (A/a - d/D):");
//                getKey = scanner.next();
//            }
//            char k = 'a';
//            String a = "a";
//            if (getKey.equals(k) || getKey.equals(a)){
//                System.out.println("ok");
//            }
//
//        }
        //        tryScanner mainScanner = new tryScanner();
//        String sometext = mainScanner.getText();
//        System.out.println(": " + sometext);

//        int totalChoice = 5;
//        char bulletPoint = 'a';
//        ArrayList<String> message = new ArrayList<>();
//        message.add("");
//        if(totalChoice >= massageList.GET_MESSAGE_NUMBER()){
//            totalChoice = massageList.GET_MESSAGE_NUMBER();
//        }
//        for(int i = 0; i < totalChoice; i++){
//            System.out.println("("+bulletPoint +") "+ massageList.massageDB(i));
//            bulletPoint++;
//        }
//        System.out.println("me: ");
//        Scanner checkkey = new Scanner(System.in);
//        String typrKey = checkkey.next();
//        System.out.println(typrKey);
//        checkkey.close();


//        Employee e = new Employee("Benjamin", "Shun", 28, 300_000);
//        System.out.println(e.toString());
//        e.riseSalary(10);
//        System.out.println(e.getSalary());
//
//        Employee e2 = e;
//        e2.riseSalary(10);
//        System.out.println(e.getSalary());
//        e2.setSalary(10);
//        System.out.println(e.getSalary());
//
//        Programmer p = new Programmer("Peerapat", "Jardrit", 28, 250_000);
//        Programmer p2 = p;
//        Employee e3 = p;
//
//        e3.setSalary(123);
//        System.out.println(":::::"+p.getSalary());
//
//        e3 = new Employee("Name", "K", 19, 0);
////        System.out.println(":::"+e3.getSalary());
//        String n1 = "n1";
//        String n2 = "n2";
//        String n1_c = "n1";
//        if (n1 == n1_c){
//            System.out.println("cmp String var /w == ok");
//        }
//        else{
//            System.out.println("n1 != n1_c");
//        }
//        if (n1 == n2){
//            System.out.println("This line should not be called.");
//
//        }
//        else{
//            System.out.println("confirm == /w dif String var, detected");
//        }
//        String n1_obj = new String("n1_obj");
//        String n1_obj_c = new String("n1_obj");
//        n1 = "n1_obj";
//        if (n1 == n1_obj){
//            System.out.println("cmp String var /w Sting obj /w == work!");
//        }
//        else {
//            System.out.println("cmp String var /w obj /w == doesn't work!");
//        }
//        if (n1_obj == n1_obj_c){
//            System.out.println("cmp obj1 == ojb2 work ok");
//        }
//        else{
//            System.out.println("cmp 2 obj /w == doesn't work");
//        }
//
//        if (n1_obj.equals(n1_obj_c)){
//            System.out.println("cmp String obj /w .equals is work");
//        }
//
//        String n11 = "n1_obj";
//        if (n1_obj.equals(n11)){
//            System.out.println("cmp obj /w var String work by .equals work.");
//        }
//        if (n11.equals(n1_obj)){
//            System.out.println("cmp String var /w obj by .equals work.");
//        }
//
//        String ignoreCase = "Mart";
//        String ignoreCase2 = "MART";
//        if (ignoreCase.equalsIgnoreCase(ignoreCase2)){
//            System.out.println("cmp String var /w method equalsIgnoreCase work /wo declare a new obj");
//        }
//        String ignoreCaseObj = new String("Mart");
//        String ignoreCaseObj2 = new String("Mart");
//        if (ignoreCaseObj.equalsIgnoreCase(ignoreCaseObj2)){
//            System.out.println("cmp String obj /w method equalsIgnoreCase work");
//        }
//
//        if (ignoreCase.equalsIgnoreCase(ignoreCaseObj)){
//            System.out.println("cmp String var /w ojb by .equalsIgnoreCase work");
//        }
//
//        if (ignoreCaseObj.equalsIgnoreCase(ignoreCase)){
//            System.out.println("cmp String obj /w String var by .equalsIgnoreCase work");
//        }
    }
}
