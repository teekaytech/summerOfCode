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
public class unit10 {
    
    
    public int[] intInit() {
        int myArray[]  = {1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 27, 29};
        return myArray;
    }
    
    //enhanced intInit() method:
    public int[] enhancedIntInit() {
        int myArray[] = {1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 27, 29};
        Logger l = Logger.getLogger(unit10.class.getName());
        for (int number : myArray) {
        l.info("Number: " + number);
        }
        return myArray;
    }
    
    
    //problem 6
    public List<Object> problem6() {
       List<Object> myList = new ArrayList<>();
       myList.add(32);
       myList.add("This is a string");
       myList.add(Integer.valueOf(238));
       myList.add(-410);  
       myList.add(null);
       
       return myList;
    }
    
}
