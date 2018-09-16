/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.makotojava.intro;

import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Teekay
 */
public class PersonTest {
    
    @Test
    public void testPerson() {     
        Person p = new Person("Joe Q", "Author", 42, 173, 82, "Brown", "MALE");
        Logger l = Logger.getLogger(Person.class.getName());
        l.info("Name: " + p.getFullName());
        l.info("Age:" + p.getAge());
        l.info("Height (cm):" + p.getHeight());
        l.info("Weight (kg):" + p.getWeight());
        l.info("Eye Color:" + p.getEyeColor());
        l.info("Gender:" + p.getGender());
        assertEquals("Joe Q Author", p.getFullName());
        assertEquals(42, p.getAge());
        assertEquals(173, p.getHeight());
        assertEquals(82, p.getWeight());
        assertEquals("Brown", p.getEyeColor());
        assertEquals("MALE", p.getGender());
    }
    @Test
    public void toStringTesting() {
        Person newPerson = new Person("Olalere", "Taofeek",22,160,49,"Black","Male");
        Logger l = Logger.getLogger(Person.class.getName());
        l.info("the concatenated string is: "+newPerson.toString());
    }
    
}
