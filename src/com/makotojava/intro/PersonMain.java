/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.makotojava.intro;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 *
 * @author Teekay
 */
public class PersonMain {
    //Unit 9 Question 10:
    public static String testingFor() {
        String output = "";
        int num = 1;
        for (int i=3; i<9; i++) {
            output += "Iteration Number: "+num + " Current Loop Variable: " + i + "\n";
            num ++;
        }   
        return output;
    }
    
    //Unit 9 Question 11:
    public static String testingWhile() {
        String output = "";
        int num = 1;
        int i = 3;
        while(i<9){
            output += "Iteration Number: "+num + " Current Loop Variable: " + i + "\n";
            num ++;
            i++;
        }   
        return output;
    }

    //Unit 9 Question 12:
    public static String testingDoWhile() {
        String output = "";
        int num = 1;
        int i = 3;
        do{
            output += "Iteration Number: "+num + " Current Loop Variable: " + i + "\n";
            num ++;
            i++;
        } while (i<9);
        return output;
    }
    
    //Unit 9 Question 13:
    public static String tenDigits() {
        String output = "";
        for (int i=0; i<10; i++) {
            if (i==4 | i==5 | i==9)
                continue;
            output += "Iteration Number: "+(i+1) + " Current Loop Variable: " +i + "\n";
        }
        return output;
    }
    
    //main() method
//    public static void main(String[] args) {
//        Logger l = Logger.getLogger(Person.class.getName());
//        List<String> listOfPersons = new ArrayList<>(); 
//        for (int aa = 0; aa < 3; aa++) {
//            Person p = new Person("Joe Q", "Author", 42, 173, 82, "Brown", "MALE");
//            listOfPersons.add(String.valueOf(p));
//            l.info("Loop executing iteration# " + aa);
//            l.info("Name: " + p.getFullName());
//            l.info("Age:" + p.getAge());
//            l.info("Height (cm):" + p.getHeight());
//            l.info("Weight (kg):" + p.getWeight());
//            l.info("Eye Color:" + p.getEyeColor());
//            l.info("Gender:" + p.getGender());
//        }
//        
//        //l.info(testingWhile());
//        //l.info(testingFor());
//        //l.info(testingDoWhile());
//        //l.info(tenDigits());
//        
//        for(String y : listOfPersons)
//            l.info(y);
//    }
}
