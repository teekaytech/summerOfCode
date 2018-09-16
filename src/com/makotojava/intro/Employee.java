/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.makotojava.intro;
import java.math.BigDecimal;
import java.util.Objects;
import java.util.logging.Logger;

/**
 *
 * @author Teekay
 */
public class Employee extends Person {
    
    private String taxpayerIdentificationNumber;
    private String employeeNumber;
    private BigDecimal salary;
    private static final Logger logger = Logger.getLogger(Employee.class.getName());

    public Employee() {
        super();
    }

    public Employee(String fname, String lname, int age, int height, int weight, String eyeColor, String gender) {
        super(fname, lname, age, height, weight, eyeColor, gender);
    }   

    public String getTaxpayerIdentificationNumber() {
        return taxpayerIdentificationNumber;
    }

    public void setTaxpayerIdentificationNumber(String taxpayerIdentificationNumber) {
        this.taxpayerIdentificationNumber = taxpayerIdentificationNumber;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public void printAudit(StringBuilder buffer) {
        //super.printAudit(buffer); //To change body of generated methods, choose Tools | Templates.
        
        // Now format this instance's values
        buffer.append("TaxpayerIdentificationNumber=");
        buffer.append(getTaxpayerIdentificationNumber());
        buffer.append(","); buffer.append("EmployeeNumber=");
        buffer.append(getEmployeeNumber());
        buffer.append(","); buffer.append("Salary=");
        buffer.append(getSalary().setScale(2).toPlainString());
    }
    
    //printAudit() method can be simplified using the customized toString() method;
    /*
    @Override
    public void printAudit(StringBuilder buffer) {
        buffer.append(toString());
    }
    */

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.taxpayerIdentificationNumber);
        hash = 97 * hash + Objects.hashCode(this.employeeNumber);
        hash = 97 * hash + Objects.hashCode(this.salary);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (!Objects.equals(this.taxpayerIdentificationNumber, other.taxpayerIdentificationNumber)) {
            return false;
        }
        if (!Objects.equals(this.employeeNumber, other.employeeNumber)) {
            return false;
        }
        if (!Objects.equals(this.salary, other.salary)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "Employee{" + "taxpayerIdentificationNumber=" + taxpayerIdentificationNumber + ", employeeNumber=" + employeeNumber + ", salary=" + salary + '}';
        //to return superclass's toString as part of the output for the Employee subclass, we add super.toString()
        //return super.toString() +"Employee{" + "taxpayerIdentificationNumber=" + taxpayerIdentificationNumber + ", employeeNumber=" + employeeNumber + ", salary=" + salary + '}';
    }
    
    public static Logger getLogger() {
        return logger;
    }
    
}
