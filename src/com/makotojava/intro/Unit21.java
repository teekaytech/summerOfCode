/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.makotojava.intro;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.logging.Logger;

/**
 *
 * @author Teekay
 */
public class Unit21 {
    Logger log = Logger.getLogger(Person.class.getName());
    
    //method to read from file
    public String readFile(String fileName) {
        String ret;
        StringBuilder sb = new StringBuilder();

        File file = new File(fileName);
        int lineNumber = 0;
        // try with-resources will close resources when done
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
           String line = reader.readLine();
           while (line != null) {
              sb.append(line);
              sb.append('\n');
              // Read the next line
              line = reader.readLine();
           }
        } catch (IOException e) {
           log.severe("IOException occurred: " + e.getLocalizedMessage());
        }

        ret = sb.toString();
        log.info("File contents:\n" + ret);

        return ret;
     }
    
    //method to write to file
    public void writeFile(String fileName, String fileContents) {
        File file = new File(fileName);
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)))) {
            writer.write(fileContents);
        } catch (IOException e) {
            log.severe("IOException occurred: " + e.getLocalizedMessage());
        } 
    }
}
