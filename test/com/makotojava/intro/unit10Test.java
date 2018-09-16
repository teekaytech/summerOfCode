/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.makotojava.intro;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Teekay
 */
public class unit10Test {

    /**
     * Test of intInit method, of class unit10.
     */
    @Test
    public void testIntInit() {
        unit10 testclass = new unit10();

        int[] intArray = testclass.intInit();

        assertEquals(intArray[0], 1);
        assertEquals(intArray[1], 2);
        assertEquals(intArray[2], 3);
        assertEquals(intArray[3], 5);
        assertEquals(intArray[4], 7);
        assertEquals(intArray[5], 11);
        assertEquals(intArray[6], 13);
        assertEquals(intArray[7], 17);
        assertEquals(intArray[8], 19);
        assertEquals(intArray[9], 23);
        assertEquals(intArray[10], 27);
        assertEquals(intArray[11], 29);
    }
    
    @Test
    public void testProblem6() {
        unit10 testclass = new unit10();
        List<Object> testObject = testclass.problem6();
        
        assertEquals(32, testObject.get(0));
        assertEquals("This is a string", testObject.get(1));
        assertEquals(Integer.valueOf(238), testObject.get(2));
        assertEquals(-410, testObject.get(3));
        assertEquals(null, testObject.get(4));
    }
}
