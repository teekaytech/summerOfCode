/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.makotojava.intro;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Teekay
 */
public class MyRegExMatcherTest {
    
    @Test
   public void testMatchesAll() {
      MyRegExMatcher classUnderTest = new MyRegExMatcher();
 
      String input = "The quick brown fox jumped over the lazy dogs";
      String regEx = ".*x.*l.*";
      boolean matches = classUnderTest.matchesAll(regEx, input);
       
      assertTrue(matches);
   }
}
