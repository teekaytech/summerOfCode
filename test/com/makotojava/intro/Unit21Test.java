/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.makotojava.intro;

import org.junit.Test;


/**
 *
 * @author Teekay
 */
public class Unit21Test {
    private static final String INPUT_FILE_NAME = "./lorem.txt";
 
    @Test
    public void testReadFile() {
        Unit21 classUnderTest = new Unit21();
        classUnderTest.readFile(INPUT_FILE_NAME);      
    }
    
    @Test
    public void testWriteFile() {
        String fileName = "./lorem2.txt"; 
        Unit21 classUnderTest = new Unit21();
        String fileContents = classUnderTest.readFile(INPUT_FILE_NAME);
        classUnderTest.writeFile(fileName, fileContents);
    }
}
