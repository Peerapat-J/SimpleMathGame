package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class tryBuffer {
    public static void runBuff() throws IOException {
//        System.out.println("Your file name ?:");
//        Scanner scaner = new Scanner(System.in);
//        String fileName = scaner.nextLine();
        try (BufferedReader reader = new BufferedReader(new FileReader("src/inputFile.txt"));){
            String rawData = reader.readLine();
            String[] data;
            ArrayList<String> Cap = new ArrayList<>();
            ArrayList<String> Mini = new ArrayList<>();
            ArrayList<String> Num = new ArrayList<>();
            while (rawData != null){
                data = rawData.split(",");
                Cap.add(data[0]);
                Mini.add(data[1]);
                Num.add(data[2]);
//              System.out.println("Capitalize: "+data[0]);
//              System.out.println("Minimal: "+data[1]);
//              System.out.println("Num: "+data[2]);
                rawData = reader.readLine();
            }
            reader.close();
            System.out.println("All capitalize found:"+Cap);
            System.out.println("All mini case:"+Mini);
            System.out.println("All num :"+Num);
            System.out.println("!");
        }

    }

    public static void fileRead() throws IOException {
        BufferedReader getReader = Files.newBufferedReader(Paths.get("src/inputFile.txt"));
        System.out.println("\n>>> This shit is suck! as the same as the old way one,\nbut why you tell me this style is better ahh ? <<<");
    }
}
