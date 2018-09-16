/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.makotojava.intro;
import java.util.Objects;
import java.util.logging.Logger;
/**
 *
 * @author Teekay
 */
public class Person {

    //using static method getLogger() and passing the current class name as the string argument
    Logger l = Logger.getLogger(Person.class.getName());

    //private String name;
    private String firstName;
    private String lastName;
    private int age;
    private int height;
    private int  weight;
    private String eyeColor;
    private String gender;

    public Person() {
        // Nothing to do...
    }

    public Person(String fname, String lname, int age, int height, int weight, String eyeColor, String gender) {
        this.firstName = fname;
        this.lastName = lname;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
        this.gender = gender;
  }

    public void setFirstName(String fname) {
        this.firstName = fname;
    }
    
    public void setLastName(String lname) {
        this.lastName = lname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
        
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public String getFirstName() {
        return this.firstName;
    }
    
    public String getLastName() {
        return this.lastName;
    }
    public String getFullName() {
        return getFirstName().concat(" ").concat(getLastName());
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public String getGender() {
        return gender;
    }
    //Question 4, Unit 6

    @Override
    public String toString() {
        return "Person{" + "l=" + l + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", height=" + height + ", weight=" + weight + ", eyeColor=" + eyeColor + ", gender=" + gender + '}';
    }

    //overloading methods
    public void printAudit(StringBuilder buffer) {
        buffer.append("Name=");
        buffer.append(getFullName());
        buffer.append(",");
        buffer.append("Age=");
        buffer.append(getAge());
        buffer.append(",");
        buffer.append("Height=");
        buffer.append(getHeight());
        buffer.append(",");
        buffer.append("Weight=");
        buffer.append(getWeight());
        buffer.append(",");
        buffer.append("EyeColor=");
        buffer.append(getEyeColor());
        buffer.append(",");
        buffer.append("Gender=");
        buffer.append(getGender());
    }
    
    public void printAudit(Logger l) {
        StringBuilder sb = new StringBuilder();
        printAudit(sb);
        l.info(sb.toString());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.l);
        hash = 97 * hash + Objects.hashCode(this.firstName);
        hash = 97 * hash + Objects.hashCode(this.lastName);
        hash = 97 * hash + this.age;
        hash = 97 * hash + this.height;
        hash = 97 * hash + this.weight;
        hash = 97 * hash + Objects.hashCode(this.eyeColor);
        hash = 97 * hash + Objects.hashCode(this.gender);
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
        final Person other = (Person) obj;
        if (this.age != other.age) {
            return false;
        }
        if (this.height != other.height) {
            return false;
        }
        if (this.weight != other.weight) {
            return false;
        }
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        if (!Objects.equals(this.eyeColor, other.eyeColor)) {
            return false;
        }
        if (!Objects.equals(this.gender, other.gender)) {
            return false;
        }
        if (!Objects.equals(this.l, other.l)) {
            return false;
        }
        return true;
    }

}

