/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.makotojava.intro;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Teekay
 */
public class MyRegExMatcher {
    
    
    public boolean matchesAll(String regex, String input) {
        boolean output = false; 
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
       
        output = matcher.matches();
        return output;   
    }
}
