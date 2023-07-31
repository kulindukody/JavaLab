/**
 *
 * @author Kulindu Kodithuwakku
 */
package com.mycompany.lab04;
public class Lab04 
{
    public static void main(String[] args) 
    {
        Employee e=new Employee();
        e.setName("Kuli");
        e.setAge(19);
        e.setSalary(50000.0);
        e.test();
        
        String name=e.getName();
        int age=e.getAge();
        double salary=e.getSalary();
        
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
    }
}
