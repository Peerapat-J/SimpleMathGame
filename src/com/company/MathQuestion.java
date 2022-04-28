package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
//import jline.console.ConsoleReader;
public class MathQuestion {

    private int Level = 1;
    private int setLv = 1;
    private int upperBound = 199;
    private int lowerBound = 10;
    private static int questionCount = 1;
    private int Answer = 0;
    private int choiceAns = 0;
    private ArrayList<Integer> wrongChoice;
    private ArrayList<Integer> correctChoice;

    public MathQuestion() {

        System.out.println("MANUAL");
        System.out.println("1. Set your level you want to play.");
        System.out.println("Level 1 is the easiest, 9 is the hardest level available.");
        System.out.println("choose level you want to play (1 - 4)");
        Scanner scanner = new Scanner(System.in);
        setLv = scanner.nextInt();
        scanner.close();
        setLEVEL(setLv);
    }

    public int getLEVEL() {
        return Level;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int level) {
        Level = level;
    }

    public int getSetLv() {
        return setLv;
    }

    public void setSetLv(int setLv) {
        this.setLv = setLv;
    }

    public int getUpperBound() {
        return upperBound;
    }

    public void setUpperBound(int upperBound) {
        this.upperBound = upperBound;
    }

    public int getLowerBound() {
        return lowerBound;
    }

    public void setLowerBound(int lowerBound) {
        this.lowerBound = lowerBound;
    }

    public static int getQuestionCount() {
        return questionCount;
    }

    public static void setQuestionCount(int questionCount) {
        MathQuestion.questionCount = questionCount;
    }

    public int getAnswer() {
        return Answer;
    }

    public void setAnswer(int answer) {
        Answer = answer;
    }

    public int getChoiceAns() {
        return choiceAns;
    }

    public void setChoiceAns(int choiceAns) {
        this.choiceAns = choiceAns;
    }

    public ArrayList<Integer> getWrongChoice() {
        return wrongChoice;
    }

    public void setWrongChoice(ArrayList<Integer> wrongChoice) {
        this.wrongChoice = wrongChoice;
    }

    public ArrayList<Integer> getCorrectChoice() {
        return correctChoice;
    }

    public void setCorrectChoice(ArrayList<Integer> correctChoice) {
        this.correctChoice = correctChoice;
    }

    public void setLEVEL(int setLv) {
        if(setLv > 4){
            setLv = 4;
        }
        else if (setLv < 1){
            setLv = 1;
        }
        this.Level = setLv;
        System.out.println("level set[OK]");
        setBounding();
    }

    /**
     *
     *  Upperbound number of question function can generate.
     *                  from Lv 1 - 9 will be as follows.
     *                  Lv 1: 1 - 199
     *                  Lv 2: 1 - 1999
     *                  Lv 3: 1 - 19999 and so on...
     *
     */
    private void setBounding(){
        this.upperBound = (int)(Math.pow(100, this.Level) * 2 - 1);
        this.lowerBound = (int)(Math.pow(100, this.Level));
        System.out.println("bounding set[OK]");
        genAnswer();
    }

    public void genAnswer(){
        Random randNum = new Random();
        this.Answer = randNum.nextInt(this.lowerBound, this.upperBound);
        System.out.println("generate answer [OK]");
        randomCorrectChoice();
    }

    public void randomCorrectChoice(){
        Random random = new Random();
        this.choiceAns = random.nextInt(0, 3);
        System.out.println("defined correct choice [OK]");
        genWrongChoice();
    }

    // set this method is set public for debugging.
    public void genWrongChoice(){

        Random randObj = new Random();
        ArrayList<Integer> wrongChoiceTemp = new ArrayList<>();

        for (int i = 0; i < 3; i++){

            int choiceNum_1 = (this.Answer - (this.Answer / (randObj.nextInt(6, 10)))) / 2;
            int choiceNum_2 = (this.Answer + (this.Answer / (randObj.nextInt(6, 10)))) / 2;

            // If sum of random number = Answer then must to re-generate a new choice number.
            if((choiceNum_1 + choiceNum_2) == this.Answer){
                choiceNum_2 = choiceNum_2 - randObj.nextInt(1, 5);
            }
            wrongChoiceTemp.add(choiceNum_1);
            wrongChoiceTemp.add(choiceNum_2);
        }
        this.wrongChoice = wrongChoiceTemp;
        System.out.println("generate wrong choice [OK]");
        genCorrectChoice();
    }

    public void genCorrectChoice(){
        ArrayList<Integer> correctChoiceTemp = new ArrayList<>();
        Random randObj = new Random();
        int temp = (this.Answer / 2) - randObj.nextInt(6, 10);
        correctChoiceTemp.add(temp);
        correctChoiceTemp.add(this.Answer - temp);

        this.correctChoice = correctChoiceTemp;

        System.out.println("generate correct choice [OK]");
        printChoice();
    }
    public void printChoice(){

        // clear cmd
        for(int clear = 0; clear < 1000; clear++)
        {
            System.out.println("\b") ;
        }

        /**
        Question pattern:
        Q(n): From the following number have summing result = XXX ?
        (a). RandomNum_1, RandomNum_2
        (b). RandomNum_3, RandomNum_4
        (c). Correct answer from random function.
        (b). RandomNum_5, RandomNum_6
         */
        System.out.println("\nQ("+questionCount+"): From the following number, which have sum result = "+ Answer +" ?");
        //get correct choice ?
        char c = 'a';
        for (int i = 0; i < 3; i++){
            if(i == this.choiceAns){
                System.out.print("("+c+"). "+this.correctChoice.get(0) + ", ");
                System.out.print(this.correctChoice.get(1) + "\n");
                c++;
            }
            System.out.print("("+c+"). "+this.wrongChoice.get(i + i) + ", ");
            System.out.print(this.wrongChoice.get(i + 1) + "\n");
            c++;
        }
        System.out.println("\n");
        System.out.println("generate choice [Done]");
    }

    public void genMathQuestion(){

        Random randNum = new Random();
        int Q_sum = randNum.nextInt(this.lowerBound, this.upperBound);
        int randChoiceCal = (int)(randNum.nextInt(Q_sum/4, Q_sum/2));

        System.out.println("Q" + this.questionCount + ")" + "What're 2 number that have summing of " + Q_sum + "?");
        for (char i = 'a'; i < 'e'; i++){
            System.out.println("("+i+")");
        }
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number 1 :");
        int n1 = scanner.nextInt();
        System.out.println("Number 1 :");
        int n2 = scanner.nextInt();

        if((n1 + n2) == Q_sum ){
            System.out.println("Correct!, do you want to play again ? (Y/N)");
        }
        else {
            System.out.println("Wrong!, do you want to play again ? (Y/N)");
        }

        String checkYN = scanner.next();
        if (checkYN.toLowerCase().equalsIgnoreCase("y")){
            System.out.println("Let's gooooo");
        }
        else {
            System.out.println("The fuck ?");
        }
    }
}
