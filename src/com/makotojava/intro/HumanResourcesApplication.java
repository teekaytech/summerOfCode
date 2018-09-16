/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.makotojava.intro;
import java.math.BigDecimal;
import java.util.logging.Logger;

/**
 *
 * @author Teekay
 */
public class HumanResourcesApplication {
    private static final Logger log = Logger.getLogger(HumanResourcesApplication.class.getName());
    
    public static void main (String [] args) {
        Employee e = new Employee();
        e.setFirstName("J Smith");
        e.setEmployeeNumber("0001");
        e.setTaxpayerIdentificationNumber("123-45-6789");
        e.setSalary(BigDecimal.valueOf(45000.0));
        e.printAudit(log);
    }
}
