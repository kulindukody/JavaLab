/**
 *
 * @author Kulindu Kodithuwakku
 */
package com.mycompany.lab05;

public class Lab05 {

    public static void main(String[] args) 
    {
        Employee a=new Employee();
        Employee b=new Employee();
        a.setempID(1324);
        a.setempName("Bogdan");
        a.setempDesignation("Manager");
        b.setempID(4231);
        b.setempName("Bird");
        b.setempDesignation("Assistant");
        
        System.out.println("Employee ID: "+a.getempID());
        System.out.println("Employee Name: "+a.getempName());
        System.out.println("Employee Designation: "+a.getempDesignation());
        System.out.println("Employee ID: "+b.getempID());
        System.out.println("Employee Name: "+b.getempName());
        System.out.println("Employee Designation: "+b.getempDesignation());
    }
}
