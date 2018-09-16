/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.makotojava.intro;

import java.math.BigDecimal;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Teekay
 */
public class EmployeeTest {
    
    @Test
    public void test() {
        int int1 = 1;
        int int2 = 1;
        Logger l = Logger.getLogger(EmployeeTest.class.getName());
        l.info("Q: int1 == int2? A: " + (int1 == int2));
        Integer integer1 = Integer.valueOf(int1);
        Integer integer2 = Integer.valueOf(int2);
        l.info("Q: Integer1 == Integer2? A: " + (integer1 == integer2));
        integer1 = new Integer(int1);
        integer2 = new Integer(int2);
        l.info("Q: Integer1 == Integer2? A: " + (integer1 == integer2));
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        l.info("Q: Employee1 == Employee2? A: " + (employee1 == employee2));
    }
    @Test
    public void anotherTest() {
        Logger l = Logger.getLogger(Employee.class.getName());
        Integer integer1 = Integer.valueOf(1);
        Integer integer2 = Integer.valueOf(1);
        l.info("Q: integer1 == integer2 ? A: " + (integer1 == integer2));
        l.info("Q: integer1.equals(integer2) ? A: " + integer1.equals(integer2));
        integer1 = new Integer(integer1);
        integer2 = new Integer(integer2);
        l.info("Q: integer1 == integer2 ? A: " + (integer1 == integer2));
        l.info("Q: integer1.equals(integer2) ? A: " + integer1.equals(integer2));
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        l.info("Q: employee1 == employee2 ? A: " + (employee1 == employee2));
        l.info("Q: employee1.equals(employee2) ? A : " + employee1.equals(employee2));
    }
    
    @Test
    public void yetAnotherTest() {
        Logger l = Logger.getLogger(Employee.class.getName());
        Employee employee1 = new Employee();
        employee1.setFirstName("J Smith");
        Employee employee2 = new Employee();
        employee2.setFirstName("J Smith");
        l.info("Q: employee1 == employee2? A: " + (employee1 == employee2));
        l.info("Q: employee1.equals(employee2)? A: " + employee1.equals(employee2));
    }
    
}
