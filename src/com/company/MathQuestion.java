package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
//import jline.console.ConsoleReader;
public class MathQuestion {

    private boolean byPass = false;
    private int Level = 1;
    private int setLv = 1;
    private int upperBound = 199;
    private int lowerBound = 100;
    private int Answer = 0;
    private int choiceAns = 0;
    private static int questionCount = 1;
    private String getKey = "";
    private String choiceKey = "";
    private ArrayList<Integer> wrongChoice;
    private ArrayList<Integer> correctChoice;

    public MathQuestion() {

        System.out.println("MANUAL");
        System.out.println("1. Set your level you want to play.");
        System.out.println("Level 1 is the easiest, 9 is the hardest level available.");
        System.out.println("choose level you want to play (1 - 4)");
        Scanner scanner = new Scanner(System.in);
        setLEVEL(scanner.next());
    }

    private int getLevel() {
        return Level;
    }

    private void setLevel(int level) {
        Level = level;
    }

    private int getSetLv() {
        return setLv;
    }

    private void setSetLv(int setLv) {
        this.setLv = setLv;
    }

    private int getUpperBound() {
        return upperBound;
    }

    private void setUpperBound(int upperBound) {
        this.upperBound = upperBound;
    }

    private int getLowerBound() {
        return lowerBound;
    }

    private void setLowerBound(int lowerBound) {
        this.lowerBound = lowerBound;
    }

    private static int getQuestionCount() {
        return questionCount;
    }

    private static void setQuestionCount(int questionCount) {
        MathQuestion.questionCount = questionCount;
    }

    private int getAnswer() {
        return Answer;
    }

    private void setAnswer(int answer) {
        Answer = answer;
    }

    private int getChoiceAns() {
        return choiceAns;
    }

    private void setChoiceAns(int choiceAns) {
        this.choiceAns = choiceAns;
    }

    private ArrayList<Integer> getWrongChoice() {
        return wrongChoice;
    }

    private void setWrongChoice(ArrayList<Integer> wrongChoice) {
        this.wrongChoice = wrongChoice;
    }

    private ArrayList<Integer> getCorrectChoice() {
        return correctChoice;
    }

    private void setCorrectChoice(ArrayList<Integer> correctChoice) {
        this.correctChoice = correctChoice;
    }

    private String getChoiceKey() {
        return choiceKey;
    }

    private String getGetKey() {
        return getKey;
    }

    private void setGetKey(String getKey) {
        this.getKey = getKey;
    }

    private void setChoiceKey(String choiceKey) {
        this.choiceKey = choiceKey;
    }

    private void setLEVEL(String setLv) {
        boolean valid = false;
        Scanner sc = new Scanner(System.in);
        while (!valid){
            if (setLv.equalsIgnoreCase("1") ||
                    setLv.equalsIgnoreCase("2") ||
                    setLv.equalsIgnoreCase("3") ||
                    setLv.equalsIgnoreCase("4")){
                valid = true;
                if (setLv.equals("1")){
                    this.Level = 1;
                }
                else if (setLv.equals("2")){
                    this.Level = 2;
                }
                else if (setLv.equals("3")){
                    this.Level = 3;
                }
                else if (setLv.equals("4")){
                    this.Level = 4;
                }
            }
            else {
                System.out.println("Invalid level!, (1 - 4)?: ");
                setLv = sc.next();
            }
        }
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

    private void genAnswer(){
        if(!this.byPass){
            Random randNum = new Random();
            this.Answer = randNum.nextInt(this.lowerBound, this.upperBound);
            System.out.println("generate answer [OK]");
            randomCorrectChoice();
        }
    }

    private void randomCorrectChoice(){
        Random random = new Random();
        this.choiceAns = random.nextInt(0, 3);
        System.out.println("defined correct choice [OK]");
        genWrongChoice();
    }

    private void genWrongChoice(){

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

    private void genCorrectChoice(){
        ArrayList<Integer> correctChoiceTemp = new ArrayList<>();
        Random randObj = new Random();
        int temp = (this.Answer / 2) - randObj.nextInt(6, 10);
        correctChoiceTemp.add(temp);
        correctChoiceTemp.add(this.Answer - temp);

        this.correctChoice = correctChoiceTemp;

        System.out.println("generate correct choice [OK]");
        printChoice();
    }

    private void printChoice(){
        /**
        Question pattern:
        Q(n): From the following number have summing result = XXX ?
        (a). RandomNum_1, RandomNum_2
        (b). RandomNum_3, RandomNum_4
        (c). Correct answer from random function.
        (b). RandomNum_5, RandomNum_6
         */
        System.out.println("\nQ("+questionCount+"): From the following number, which have sum result = "+ Answer +" ?");
        questionCount++;
        char c = 'a';
        for (int i = 0; i < 3; i++){
            if(i == this.choiceAns){
                System.out.print("("+c+"). "+this.correctChoice.get(0) + ", ");
                System.out.print(this.correctChoice.get(1) + "\n");
                manualCastCharToString(c);
                c++;
            }
            System.out.print("("+c+"). "+this.wrongChoice.get(i + i) + ", ");
            System.out.print(this.wrongChoice.get(i + 1) + "\n");
            c++;
        }
        System.out.println("\n");
        System.out.println("generate choice [Done]");
        genMathQuestion();
    }

    private void castIntToChar(){
        if (this.getChoiceAns() == 1) this.setChoiceKey("a");
        else if (this.getChoiceAns() == 2) this.setChoiceKey("b");
        else if (this.getChoiceAns() == 3) this.setChoiceKey("c");
        else this.setChoiceKey("d");
    }
    private void manualCastCharToString(char cc){
       if (cc == 'a') setChoiceKey("a");
       else if (cc == 'b') setChoiceKey("b");
       else if (cc == 'c') setChoiceKey("c");
       else if (cc == 'd') setChoiceKey("d");
    }

    private String checkValidChoiceAtoD(String ch){
        boolean valid = false;
        Scanner temp = new Scanner(System.in);
        while (!valid){
            if (ch.equalsIgnoreCase("a") ||
            ch.equalsIgnoreCase("b") ||
            ch.equalsIgnoreCase("c") ||
            ch.equalsIgnoreCase("d")){
                valid = true;
            }
            else {
                System.out.println("Invalid choice!, (A/a - D/d)?: ");
                ch = temp.next();
            }
        }
        return ch;
    }
    private String checkValidChoiceYN(String ch){
        boolean valid = false;
        Scanner temp = new Scanner(System.in);
        while (!valid){
            if (ch.equalsIgnoreCase("y") ||
                    ch.equalsIgnoreCase("n")){
                valid = true;
            }
            else{
                System.out.println("Invalid choice!, (Y/y, N/n)?: ");
                ch = temp.next();
            }
        }
        return ch;
    }

    private void genMathQuestion(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Your answer (A/a - d/D):");
        boolean correctness = false;
        String getKey = checkValidChoiceAtoD(scanner.next());
        if (getKey.equals(getChoiceKey())){
            System.out.println("Correct!, do you want to play again ? (Y/N)");
        }
        else {
            System.out.println("Wrong!, do you want to play again ? (Y/N)");
        }

        getKey = checkValidChoiceYN(scanner.next());
        if (getKey.equalsIgnoreCase("y")){
            System.out.println("You want to change question level ? (Y/N)");

            getKey = checkValidChoiceYN(scanner.next());
            if (getKey.equalsIgnoreCase("y")){
                System.out.println("choose level you want to play (1 - 4)");
                setLEVEL(scanner.next());
            }
            genAnswer();
        }
         if (getKey.equalsIgnoreCase("n") && !this.byPass){
             System.out.println("Bye!");
             this.byPass = true;
         }
    }

}
