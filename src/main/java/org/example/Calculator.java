package org.example;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
class Inputs{
    protected double a;
    protected double b;
    Logger l=Logger.getLogger("arun");
    Scanner sc=new Scanner(System.in);
    public void inputs(){
        if(a==0) {
            l.info("Enter the first no");
            a = sc.nextDouble();
            l.info("Enter the second no");
        }
        else {
            l.info("Enter the second no:");
        }
        b = sc.nextDouble();
    }
}
class Calculation extends Inputs{
    protected double add(){
        return a+b;
    }
    protected double sub(){
        return a-b;
    }
    protected double multi(){
        return a*b;
    }
    protected double div(){
        return a/b;
    }
}
public class Calculator {
    public static void main(String[] args) {
        Logger l=Logger.getLogger("arun");
        Scanner sc=new Scanner(System.in);
        l.info("Welcome to simple Calculation");
        Calculation i=new Calculation();
        double result = 0;
        while(true){
            i.inputs();
            l.info("Enter the operation:"+"Exit-e");
            char ch=sc.next().charAt(0);
            switch (ch) {
                case 'e' -> System.exit(0);
                case '+' -> {
                    result = i.add();
                    double finalResult = result;
                    l.log(Level.INFO, () -> "Result: " + finalResult);
                }
                case '-' -> {
                    result = i.sub();
                    double finalResult1 = result;
                    l.log(Level.INFO, () -> "Result: " + finalResult1);
                }
                case '*' -> {
                    result = i.multi();
                    double finalResult2 = result;
                    l.log(Level.INFO, () -> "Result: " + finalResult2);
                }
                case '/' -> {
                    result = i.div();
                    double finalResult3 = result;
                    l.log(Level.INFO, () -> "Result: " + finalResult3);
                }
            }
            l.info("If you need to use old answer Y(or)N :");
            char re=sc.next().charAt(0);
            if(re == 'Y' || re=='y'){
                i.a=result;    
            } else if (re=='N'|| re=='n') {
                i.a=0;
            }
        }
    }
}